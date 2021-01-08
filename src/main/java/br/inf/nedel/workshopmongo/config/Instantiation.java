package br.inf.nedel.workshopmongo.config;

import br.inf.nedel.workshopmongo.domain.User;
import br.inf.nedel.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();


        User maria= new User(null, "Maria Brown", "maria@gmail.com");
        User alex= new User(null, "Alex Green", "alex@gmail.com");
        User bob= new User(null, "BobGrey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
