package org.example.repository;

import org.example.model.Exercicio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioRepository extends MongoRepository<Exercicio, String> {
}
