package com.example.demo.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MyUserRepo extends MongoRepository<Gamer, String> {

    Optional<Gamer> findByUsername(String username);

    List<Gamer> findAllByGameDataGameId(String gameId);

}
