package com.company;

public class Professor extends Docente{
    public String formacao;


    public Professor(String nome, int idade, String email, double salario, String formacao){
        super(nome, idade, email, salario = 7000.00);
        this.formacao = formacao;

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
    public String getFormacao(){
        return formacao;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
