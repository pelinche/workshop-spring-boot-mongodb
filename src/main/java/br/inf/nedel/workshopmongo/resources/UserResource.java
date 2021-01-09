package br.inf.nedel.workshopmongo.resources;


import br.inf.nedel.workshopmongo.domain.User;
import br.inf.nedel.workshopmongo.dto.UserDTO;
import br.inf.nedel.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll(){
        //User luis = new User("1","Luis Carlos","pelinche@gmail.com");
        //User alex = new User("2","Alex","alex@gmail.com");

        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<UserDTO> findById(@PathVariable String id){

        User obj = service.findById(id);

        return ResponseEntity.ok().body(new UserDTO(obj));
    }


}
