package view;

import controller.AlunoController;
import model.Aluno;

import java.util.Scanner;

public class ViewMenu {
    Scanner scanner = new Scanner(System.in);
    AlunoController controller = new AlunoController();

    public int exibirMenu() {
        System.out.print("""
                        ==============================
                               SISTEMA ESCOLAR
                        ==============================
                        1 - Cadastrar aluno
                        2 - Remover aluno
                        3 - Listar alunos
                        4 - Buscar aluno
                        5 - Sair
                        ==============================
                        Escolha uma opção:
                        """);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    public void adicionarAluno() {
        while (true){
            System.out.print("Informe o nome do aluno: ");
            String nomeInput = scanner.nextLine();

            int idadeValidada = 0;
            while (true) {
                try {
                    System.out.print("Informe a idade do aluno: ");
                    String idadeInput = scanner.nextLine();
                    idadeValidada = Integer.parseInt(idadeInput);
                    break;
                } catch (Exception e) {
                    System.out.println("ERRO: Informe uma idade válida.");
                }
            }

            try {
                controller.adicionarAluno(nomeInput, idadeValidada);
                System.out.println("Aluno adicionado com sucesso!");
                break;
            } catch (RuntimeException e) {
                System.out.println("CONTROLLER ERROR: " + e.getMessage());
            }
        }
    }

    public void removerAluno() {
        while (true){
            int idAlunoValidado = 0;
            while (true) {
                try {
                    System.out.print("Informe o id do aluno: ");
                    String idInput = scanner.nextLine();
                    idAlunoValidado = Integer.parseInt(idInput);
                    break;
                } catch (Exception e) {
                    System.out.println("ERRO: Informe um ID válido");
                }
            }
            try {
                controller.removerAluno(idAlunoValidado);
                break;
            } catch (RuntimeException e) {
                System.out.println("CONTROLLER ERROR: " + e.getMessage());
            }
        }
    }

    public void listarAlunos() {
        try {
            System.out.println("ALUNOS:");
            for(Aluno a : controller.listarAlunos() ) {
                System.out.println("------------------------------");
                System.out.println(a);
            }

        } catch (RuntimeException e) {
            System.out.println("CONTROLLER ERROR: " + e.getMessage());
        }
    }

    public void buscarAluno() {
        int idAlunoValidado = 0;
        try {
            System.out.print("Informe o ID do aluno: ");
            String idInput = scanner.nextLine();
            idAlunoValidado = Integer.parseInt(idInput);
        } catch (RuntimeException e) {
            System.out.println("ERRO: Informe ID válido.");;
        }

        try {
            System.out.println("ALUNO ENCONTRADO:");
            System.out.println("------------------------------");
            System.out.println(controller.buscarPorId(idAlunoValidado));
            System.out.println("------------------------------");
        } catch (RuntimeException e) {
            System.out.println("CONTROLLER ERROR: " + e.getMessage());;
        }
    }

    public void sair() {
        System.out.println("SISTEMA FINALIZANDO...");
    }

}