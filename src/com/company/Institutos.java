package com.company;

import javax.swing.*;
import java.awt.event.TextEvent;
import java.util.ArrayList;
import java.util.Comparator;

public class Institutos {

    ArrayList<Disciplinas> disciplinas = new ArrayList<>();
    public String nome;


    public Institutos(String nome){
        this.nome = nome;
    }

    public Institutos(){

    }
    void adcionarDisciplinas(Disciplinas disciplina){
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public int disciplinaEscolhida(Institutos institutos){
        String textoDisplay = "Disciplinas disponiveis:\n";
        for (int i = 0; i < disciplinas.size(); i++) {
            textoDisplay += i+1 + " - " + institutos.disciplinas.get(i).getNome() + "\n";
        }
        return Integer.parseInt(JOptionPane.showInputDialog(null, textoDisplay + "\nEscolha a disciplina"));
    }


    public String disciplinaInfo(Disciplinas disciplinas){
        String textoDisplay = "Informações sobre "+ disciplinas.getNome() +"\n";
        textoDisplay += "Diretor: " + disciplinas.diretor.getNome() + "\n";
        textoDisplay += "Idade: " + disciplinas.diretor.getIdade() + "\n";
        textoDisplay += "Email: " + disciplinas.diretor.getEmail() + "\n";
        textoDisplay += "Salario: R$" + disciplinas.diretor.getSalario() + "\n";
        textoDisplay += "Coordenador: " + disciplinas.coordenador.getNome()+ "\n";
        textoDisplay += "Idade: " + disciplinas.coordenador.getIdade() + "\n";
        textoDisplay += "Email: " + disciplinas.coordenador.getEmail() + "\n";
        textoDisplay += "Salario: R$" + disciplinas.coordenador.getSalario() + "\n";
        textoDisplay += "Professor: "+ disciplinas.professor.getNome()+"\n";
        textoDisplay += "Idade: " + disciplinas.professor.getIdade()+"\n";
        textoDisplay += "Email: " + disciplinas.professor.getEmail()+"\n";
        textoDisplay += "Salario: R$" + disciplinas.professor.getSalario()+"\n";
        textoDisplay += "Formacao: " + disciplinas.professor.getFormacao()+"\n";
        textoDisplay += "Monitor: " + disciplinas.monitor.getNome() + "\n";
        textoDisplay += "Idade: " + disciplinas.monitor.getIdade() + "\n";
        textoDisplay += "Email: " + disciplinas.monitor.getEmail() + "\n";
        textoDisplay += "Salario: R$" + disciplinas.monitor.getSalario() + "\n";
        textoDisplay += "Ano de ingresso - " + disciplinas.monitor.getAno() + "\n";
        if (disciplinas.monitor.getAvaliação()){
            textoDisplay += "Avaliação - Aprovado\n";
        }
        else if (!disciplinas.monitor.getAvaliação()){
            textoDisplay += "Avaliação - Reprovado\n";
        }

        for (int i = 0; i < disciplinas.getAlunos().size(); i++) {
            textoDisplay += "Aluno "+(i+1) + " : " + disciplinas.getAlunos().get(i).getNome()+"\n";
            textoDisplay += "Idade: " + disciplinas.getAlunos().get(i).getIdade()+"\n";
            textoDisplay += "Email: " + disciplinas.getAlunos().get(i).getEmail()+"\n";
            textoDisplay += "Media " + disciplinas.getAlunos().get(i).getMedia()+"\n";
            textoDisplay += "Presença " + disciplinas.getAlunos().get(i).getPresenca()+"\n";
            textoDisplay += "Ano ingresso " + disciplinas.getAlunos().get(i).getAno()+"\n";
            if (disciplinas.getAlunos().get(i).isStatus() == true){
                textoDisplay += "Status - " + "Aprovado\n";
            }
            else {
                textoDisplay += "Status - " + "Reprovado\n";
            }


        }
        double mediaSala = 0;
        for (int j = 0; j < disciplinas.alunos.size(); j++){
            mediaSala += disciplinas.alunos.get(j).getMedia();

        }
        double mediaSalaFinal = mediaSala/disciplinas.alunos.size();
        textoDisplay += "Media da sala: " + mediaSalaFinal + "\n";
        Aluno maiorAluno = disciplinas.alunos.stream().max(Comparator.comparingInt(Aluno::getIdade)).get();
        textoDisplay += "Aluno mais velho: "+maiorAluno.getNome()+" com "+maiorAluno.getIdade()+" anos "+"\n";
        Aluno menorAluno = disciplinas.alunos.stream().min(Comparator.comparingInt(Aluno::getIdade)).get();
        textoDisplay += "Aluno mais novo: "+menorAluno.getNome()+" com "+menorAluno.getIdade()+" anos "+"\n";
        Aluno maiorMedia = disciplinas.alunos.stream().max(Comparator.comparingDouble(Aluno::getMedia)).get();
        textoDisplay += "Melhor aluno: " + maiorMedia.getNome() + " com "+ maiorMedia.getMedia()+"\n";
        Aluno menorMedia = disciplinas.alunos.stream().min(Comparator.comparingDouble(Aluno::getMedia)).get();
        textoDisplay += "Pior aluno: " + menorMedia.getNome()+ " com " + menorMedia.getMedia()+"\n";
        return textoDisplay;
    }
}
