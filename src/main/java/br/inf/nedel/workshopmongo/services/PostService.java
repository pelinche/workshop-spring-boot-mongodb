package br.inf.nedel.workshopmongo.services;

import br.inf.nedel.workshopmongo.domain.Post;
import br.inf.nedel.workshopmongo.domain.User;
import br.inf.nedel.workshopmongo.dto.UserDTO;
import br.inf.nedel.workshopmongo.repository.PostRepository;
import br.inf.nedel.workshopmongo.repository.UserRepository;
import br.inf.nedel.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj= repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }



}
