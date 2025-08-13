public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CC","Gabriel Henrique");
        c1.setNumConta(21312);
        c1.depositar(1500f);
        c1.sacar(200f);
        System.out.println(c1.getSaldo());
        c1.pagarMensal("CC");
        System.out.println(c1.getSaldo());
        c1.fecharConta();
        c1.sacar(21312312312312f);

        c1.estadoAtual();
    }

}
