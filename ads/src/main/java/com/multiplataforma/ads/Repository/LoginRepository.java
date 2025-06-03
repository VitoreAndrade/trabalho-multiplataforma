package com.multiplataforma.ads.Repository;

import com.multiplataforma.ads.Model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LoginRepository extends MongoRepository<Login, String> {
    Optional<Login> findByLogin(String login);

    boolean existsByLogin(String login);

    Optional<Login> findByLoginAndSenha(String login, String password);
}
