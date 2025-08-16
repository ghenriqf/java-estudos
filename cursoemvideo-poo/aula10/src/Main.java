public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();

        v1.setNome("Gabriel");
        v1.setIdade(19);
        v1.setSexo('M');

        System.out.println(v1.toString());

        Aluno a1 = new Aluno();

        a1.setNome("Claudio");
        a1.setMatricula(12414432);
        a1.setCurso("Biologia");
        a1.setSexo('M');
        a1.setIdade(20);
        a1.pagarMensalidade();

        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.pagarMensalidade();
        b1.setMatricula(87654);
        b1.setNome("Gustavo");
        b1.setBolsa(550.4f);
        b1.setSexo('M');
        b1.pagarMensalidade();

        System.out.println(b1.toString());
    }
}