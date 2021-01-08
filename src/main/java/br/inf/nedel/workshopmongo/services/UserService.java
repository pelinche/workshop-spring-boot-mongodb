package br.inf.nedel.workshopmongo.services;

import br.inf.nedel.workshopmongo.domain.User;
import br.inf.nedel.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
