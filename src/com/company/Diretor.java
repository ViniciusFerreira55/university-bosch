package com.company;

public class Diretor extends Docente{
    public Diretor(String nome, int idade, String email, double salario) {
        super(nome, idade, email, salario = 16000.00);

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
