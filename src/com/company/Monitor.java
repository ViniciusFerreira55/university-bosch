package com.company;

public class Monitor extends Discente{
    public int ano;
    private double salario = 2000.00;
    public boolean avaliacao;

    public Monitor(String nome, int idade, String email, int ano, boolean avaliacao, double salario){
        super(nome, idade, email);
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.ano = ano;
        this.avaliacao = avaliacao;
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAvaliacao(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getSalario() {
        return salario;
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
    public int getAno(){
        return ano;
    }
    public boolean getAvaliação(){
        return avaliacao;
    }
}
