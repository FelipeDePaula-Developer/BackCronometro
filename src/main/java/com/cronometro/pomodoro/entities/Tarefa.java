package com.cronometro.pomodoro.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document("tarefa")
@Component
public class Tarefa {

    @Id
    private String id;
    private String tarefa;
    private String tempo;

    public Tarefa(){

    }

    public Tarefa(String tarefa, String tempo){
        this.tarefa = tarefa;
        this.tempo = tempo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
