package view;

import controller.AlunoController;

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
                System.out.println("ERRO: " + e.getMessage());
            }
        }
    }

    public void removerAluno() {

    }

    public void listarAlunos() {

    }

    public void buscarAluno() {

    }

    public void sair() {

    }

}