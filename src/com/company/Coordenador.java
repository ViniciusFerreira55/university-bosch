package com.company;

public class Coordenador extends Docente{

    public Coordenador(String nome, int idade, String email, double salario) {
        super(nome, idade, email, salario = 11000.00);
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.salario = salario;
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
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
