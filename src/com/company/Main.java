package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String nomeUni = JOptionPane.showInputDialog(null, "Digite o nome da faculdade");
        prints prints = new prints();
        Universidade universidade = new Universidade(nomeUni);
        while (true){
            String op = JOptionPane.showInputDialog(null, "1- Adicionar instituto/curso\n2- Ver institutos cadastrados" +
                    "\n3-Adicionar Disciplinas\n4-Contratar Professor\n5-Contratar Monitor\n6-Matricular Aluno");
            switch (op){
                case "1":
                    String nomeInst = JOptionPane.showInputDialog(null, "Digite o nome do instituto");
                    Institutos institutos = new Institutos(nomeInst);
                    universidade.adicionarInstitutos(institutos);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,prints.printInstitutos(universidade));
                    break;
                case "3":
                    if (universidade.institutos.size() < 1){
                        JOptionPane.showMessageDialog(null, "Ai vc chupou, não há instutos ainda");
                }
                    else {
                        int escolha = prints.institutoEscolhido(universidade);
                        while (true) {
                            String disciplinaAdicionar = JOptionPane.showInputDialog(
                                    null, "Digite a disciplina que deseja adicionar: ");
                            Disciplinas disciplinas = new Disciplinas(disciplinaAdicionar);
                            universidade.institutos.get(escolha-1).adcionarDisciplinas(disciplinas);
                            int yorno = JOptionPane.showConfirmDialog(null, "Você deseja adicionar mais alguma disciplina a esse instituto?", "Zumbas", JOptionPane.YES_NO_OPTION);

                            if (yorno == 0){
                                continue;

                            }
                            else if(yorno == 1){
                                break;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Opção Invalida");
                            }
                        }
                    }
                    break;
                case "4":
                    String nomePro = JOptionPane.showInputDialog(null, "Digite o nome do Professor");
                    int idadePro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nome do Professor"));
                    String emailPro = JOptionPane.showInputDialog(null, "Digite o email do Professor");
                    double salarioPro = 7000.00;
                    String formacaoPro = JOptionPane.showInputDialog(null, "Digite a formacao do Professor");
                    Professor professor = new Professor(nomePro,idadePro, emailPro, salarioPro,formacaoPro);
                case "5":
                    String nomeMon = JOptionPane.showInputDialog(null, "Digite o nome do Monitor");
                    int idadeMon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do Monitor"));
                    String emailMon = JOptionPane.showInputDialog(null, "Digite o email do Monitor");
                    int anoMon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano que o monitor está"));
                    boolean avalicao = Boolean.getBoolean(JOptionPane.showInputDialog(null,"O monitor passou na avaliação?", JOptionPane.YES_NO_OPTION));
                    Monitor monitor = new Monitor(nomeMon, idadeMon, emailMon, anoMon, avalicao);
//                case "6":
//                    String nomeAlu = JOptionPane.showInputDialog(null, "Digite o nome do aluno!");
//                    int idadeAlu = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno"));
//                    String emailAlu = JOptionPane.showInputDialog(null, "Digite o email do aluno");
//
//                    Aluno aluno = new Aluno(nomeAlu, idadeAlu, emailAlu, );



            }
        }

    }
}
