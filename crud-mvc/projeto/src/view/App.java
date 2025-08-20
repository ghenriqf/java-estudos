package view;

public class App {
    public static void main(String[] args) {
        ViewMenu menu = new ViewMenu();
        boolean loop = true;
        while (loop){
            int escolha = menu.exibirMenu();
            switch (escolha) {
                case 1:
                    menu.adicionarAluno();
                    break;

                case 2:
                    menu.removerAluno();
                    break;

                case 3:
                    menu.listarAlunos();
                    break;

                case 4:
                    menu.buscarAluno();
                    break;

                case 5:
                    menu.sair();
                    loop = false;
                    break;

                default:
                    System.out.println("Valor inválido!");
            }
        }
    }
}