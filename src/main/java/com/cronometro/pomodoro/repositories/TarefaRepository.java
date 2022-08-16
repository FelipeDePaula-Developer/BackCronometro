package com.cronometro.pomodoro.repositories;

import com.cronometro.pomodoro.entities.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends MongoRepository<Tarefa, String> {

}
