package com.multiplataforma.ads.Repository;

import com.multiplataforma.ads.Model.Servicos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServicoRepository extends MongoRepository<Servicos, String> {
}
