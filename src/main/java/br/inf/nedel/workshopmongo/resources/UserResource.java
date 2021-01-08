package br.inf.nedel.workshopmongo.resources;

import br.inf.nedel.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User luis = new User("1","Luis Carlos","pelinche@gmail.com");
        User alex = new User("2","Alex","alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(luis,alex));
        return ResponseEntity.ok().body(list);
    }


}
