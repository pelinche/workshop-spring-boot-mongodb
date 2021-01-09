package br.inf.nedel.workshopmongo.repository;

import br.inf.nedel.workshopmongo.domain.Post;
import br.inf.nedel.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
