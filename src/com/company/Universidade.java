package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Universidade {

    ArrayList<Institutos> institutos = new ArrayList<>();
    public String nome;

    public Universidade(String nome){
        this.nome = nome;
    }
    void adicionarInstitutos(Institutos instituto){
        institutos.add(instituto);
    }
    public ArrayList<Institutos> getInstitutos() {
        return institutos;
    }

    public String printInstitutos(Universidade universidade){
        if (universidade.institutos.size() < 1) {
            return "Nenhum instituto cadastrado";
        }else{
            String textoDisplay = "Institutos disponiveis:\n";
            for (int i = 0; i < universidade.institutos.size(); i++) {
                textoDisplay += i+1 + " - " + universidade.institutos.get(i).getNome() + "\n";
            }
            return textoDisplay;

        }}

    public int institutoEscolhido(Universidade universidade){
        String textoDisplay = "Institutos disponiveis:\n";
        for (int i = 0; i < universidade.institutos.size(); i++) {
            textoDisplay += i+1 + " - " + universidade.institutos.get(i).getNome() + "\n";
        }
        return Integer.parseInt(JOptionPane.showInputDialog(null, textoDisplay + "\nEscolha o instituto"));
    }

}
