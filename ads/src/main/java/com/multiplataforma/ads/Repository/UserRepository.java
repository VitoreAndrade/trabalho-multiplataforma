package com.multiplataforma.ads.Repository;

import com.multiplataforma.ads.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByAtivoTrue(String ativo);

    boolean existsByEmail(String email);
}
