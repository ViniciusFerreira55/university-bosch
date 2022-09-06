package com.company;

import java.util.ArrayList;

public class Disciplinas {
    public String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();
    Professor professor;
    Monitor monitor;
    Diretor diretor;
    Coordenador coordenador;

    public Disciplinas(String nome, ArrayList<Aluno> alunos, Professor professor, Monitor monitor, Diretor diretor,
                       Coordenador coordenador) {
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
        this.monitor = monitor;
        this.diretor = diretor;
        this.coordenador = coordenador;
    }

    public Disciplinas(String nome){
        this.nome = nome;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public String getNome(){
        return nome;
    }
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
    public Professor getProfessor(){
        return professor;
    }
    public Monitor getMonitor(){
        return monitor;
    }

    public void fecharSemestre(Disciplinas disciplinas){
        float aprovados = 0;
        double totalAlunos = disciplinas.alunos.size();
        for(int k = 0; k < disciplinas.alunos.size(); k++){
            if(disciplinas.alunos.get(k).isStatus()){
                aprovados += 1;
            }
        }
        if(((aprovados*100)/totalAlunos >=80)){
            double aumentoM = disciplinas.monitor.getSalario() + (disciplinas.monitor.getSalario() * 0.05);
            disciplinas.monitor.setSalario(aumentoM);
            disciplinas.monitor.setAvaliacao(true);
            double aumentoP = disciplinas.monitor.getSalario() + (disciplinas.professor.getSalario() * 0.10);
            disciplinas.professor.setSalario(aumentoP);
            double aumentoC = disciplinas.coordenador.getSalario() + (disciplinas.coordenador.getSalario() * 0.15);
            disciplinas.coordenador.setSalario(aumentoC);
            double aumentoD = disciplinas.diretor.getSalario() + (disciplinas.diretor.getSalario() * 0.20);
            disciplinas.diretor.setSalario(aumentoD);
        }
        else if((aprovados*100)/totalAlunos < 50){
            double reducaoM = disciplinas.monitor.getSalario() - (disciplinas.monitor.getSalario() * 0.05);
            disciplinas.monitor.setSalario(reducaoM);
            disciplinas.monitor.setAvaliacao(false);
            double reducaoP = disciplinas.professor.getSalario() - (disciplinas.professor.getSalario() * 0.10);
            disciplinas.professor.setSalario(reducaoP);
            double aumentoC = disciplinas.coordenador.getSalario() - (disciplinas.coordenador.getSalario() * 0.15);
            disciplinas.coordenador.setSalario(aumentoC);
            double aumentoD = disciplinas.diretor.getSalario() - (disciplinas.diretor.getSalario() * 0.20);
            disciplinas.diretor.setSalario(aumentoD);

        }
    }
}
