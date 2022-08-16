package com.cronometro.pomodoro.controllers;

import com.cronometro.pomodoro.entities.Tarefa;
import com.cronometro.pomodoro.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarefaController {

    @Autowired
    TarefaRepository tarefaRepository;

    @PostMapping("cad/tarefa")
    public String cadTarefa(@RequestBody Tarefa tarefa){
        tarefaRepository.save(tarefa);
        return tarefa.getId();
    }

    @PostMapping("get/tarefa")
    public void getTarefa(@RequestBody Tarefa tarefa){
        tarefaRepository.findAll();
    }
}
