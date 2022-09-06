package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aluno extends Discente{
    ArrayList<Double> provas = new ArrayList<Double>();
    public double nota;
    public int presenca;
    public double media;
    public int ano;
    public boolean Status;


    public Aluno(String nome, int idade, String email, double media, int presenca, int ano, boolean Status) {
        super(nome, idade, email);
        this.media = media;
        this.presenca = presenca;
        this.ano = ano;
        this.Status = Status;
    }

    public double getNota() {
        return nota;
    }

    public int getPresenca() {
        return presenca;
    }

    public double getMedia() {
        return media;
    }

    public int getAno() {
        return ano;
    }

    public boolean isStatus() {
        return Status;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getEmail(){
        return email;
    }

}