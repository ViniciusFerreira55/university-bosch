package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static Monitor criarMonitor(){
        String nomeMon = JOptionPane.showInputDialog(null, "Digite o nome do Monitor");
        int idadeMon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do Monitor"));
        String emailMon = JOptionPane.showInputDialog(null, "Digite o email do Monitor");
        int anoMon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano que o monitor ingressou"));
        int yorno = JOptionPane.showConfirmDialog(null, "O monitor passou na avaliação", "Zumbas", JOptionPane.YES_NO_OPTION);
        boolean avalicao = true;
        if (yorno == 0){
            avalicao = true;
        }
        else if(yorno == 1) {
            avalicao = false;
        }
        double salario = 2000.00;
        Monitor monitor = new Monitor(nomeMon, idadeMon, emailMon, anoMon, avalicao, salario);
        return monitor;
    }

    public static Coordenador criarCoordenador(){
        String nomeCord = JOptionPane.showInputDialog(null, "Digite o nome do coordenador");
        int idadeCord = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do coordenador"));
        String emailCoord = JOptionPane.showInputDialog(null, "Digite o email do coordenador");
        double salarioCoord = 11000.00;
        Coordenador coordenador = new Coordenador(nomeCord, idadeCord, emailCoord,salarioCoord);
        return coordenador;
    }

    public static Diretor criarDiretor(){
        String nomeDiretor = JOptionPane.showInputDialog(null, "Digite o nome do Diretor");
        int idadeDiretor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do Diretor"));
        String emailDiretor = JOptionPane.showInputDialog(null, "Digite o email do Diretor");
        double salarioDiretor = 16000.00;
        Diretor diretor = new Diretor(nomeDiretor, idadeDiretor, emailDiretor, salarioDiretor);
        return diretor;
    }

    public static Professor criarProfessor(){
        String nomePro = JOptionPane.showInputDialog(null, "Digite o nome do Professor");
        int idadePro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o idade do Professor"));
        String emailPro = JOptionPane.showInputDialog(null, "Digite o email do Professor");
        double salarioPro = 7000.00;
        String formacaoPro = JOptionPane.showInputDialog(null, "Digite a formacao do Professor");
        Professor professor = new Professor(nomePro,idadePro, emailPro, salarioPro,formacaoPro);
        return professor;
    }

    public static Aluno criarAluno(){
        String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
        int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno"));
        String emailAluno = JOptionPane.showInputDialog(null, "Digite o email do aluno");
        int notaAluno1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota 1 do aluno"));
        int notaAluno2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota 2 do aluno"));
        double mediaAluno = (notaAluno1 + notaAluno2)/2;
        int presencaAluno = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a presença"));
        int anoIngressoAluno = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite  o ano em que o aluno ingressou"));
        boolean statusAluno;
        if (mediaAluno >= 5 && presencaAluno >= 75){
             statusAluno = true;
        }
        else {
            statusAluno = false;
        }
        Aluno aluno = new Aluno(nomeAluno, idadeAluno, emailAluno, mediaAluno, presencaAluno, anoIngressoAluno, statusAluno);
        return aluno;
    }
    public static void main(String[] args) {
        String nomeUni = JOptionPane.showInputDialog(null, "Digite o nome da faculdade");
        Universidade universidade = new Universidade(nomeUni);
        while (true){
            String op = JOptionPane.showInputDialog(null, "1- Adicionar instituto/curso\n2- Ver institutos cadastrados" +
                    "\n3-Adicionar Disciplinas\n4-Ver informações das disciplinas\n5-Fechar turma");
            switch (op){
                case "1":
                    String nomeInst = JOptionPane.showInputDialog(null, "Digite o nome do instituto");
                    Institutos institutos = new Institutos(nomeInst);
                    universidade.adicionarInstitutos(institutos);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,universidade.printInstitutos(universidade));
                    break;
                case "3":
                    if (universidade.institutos.size() < 1){
                        JOptionPane.showMessageDialog(null, "Ai vc chupou, não há instutos ainda");
                }
                    else {
                        int escolha = universidade.institutoEscolhido(universidade);
                        while (true) {
                            String disciplinaAdicionar = JOptionPane.showInputDialog(
                                    null, "Digite a disciplina que deseja adicionar: ");
                            ArrayList<Aluno> alunoss = new ArrayList<>();
                            int first = 0;
                            while (first == 0){

                            alunoss.add(criarAluno());
                            first = JOptionPane.showConfirmDialog(null, "Adcionar mais um aluno", "Title", JOptionPane.YES_NO_OPTION);
                            if (first == 1){
                                break;
                            }
                            }
                            Disciplinas disciplinas = new Disciplinas(disciplinaAdicionar, alunoss, criarProfessor(),
                                    criarMonitor(), criarDiretor(), criarCoordenador());

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
                    if (universidade.institutos.size() < 1){
                        JOptionPane.showMessageDialog(null, "Vish cara, ainda não tem nenhum instituto cadastrado");
                    }

                    else {
                        int escolha = universidade.institutoEscolhido(universidade);
                        if (universidade.institutos.get(escolha-1).disciplinas.size()<1){
                            JOptionPane.showMessageDialog(null, "Não, existem disciplinas ainda");
                        }
                        else{
                            int escolhaDi = universidade.institutos.get(escolha-1).disciplinaEscolhida(universidade.institutos.get(escolha-1));
                           JOptionPane.showMessageDialog(null, universidade.institutos.get(escolha-1).disciplinaInfo(universidade.institutos.get(escolha-1).disciplinas.get(escolhaDi-1)));
                        }

                }
                    break;
                case "5":
                    if (universidade.institutos.size() < 1){
                        JOptionPane.showMessageDialog(null, "Vish cara, ainda não tem nenhum instituto cadastrado");
                    }

                    else {
                        int escolha = universidade.institutoEscolhido(universidade);
                        if (universidade.institutos.get(escolha-1).disciplinas.size()<1){
                            JOptionPane.showMessageDialog(null, "Não, existem disciplinas ainda");
                        }
                        else{
                            int escolhaDi = universidade.institutos.get(escolha-1).disciplinaEscolhida(universidade.institutos.get(escolha-1));
                            universidade.institutos.get(escolha-1).disciplinas.get(escolhaDi-1).fecharSemestre(universidade.institutos.get(escolha-1).disciplinas.get(escolhaDi-1));
                            JOptionPane.showMessageDialog(null, "Semestre Fechado");
                        }
        }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");

    }
}}}
