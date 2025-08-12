public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC Cristal",1.5f, "Azul");
        Caneta c2 = new Caneta("Cis", 0.5f, "Preta");

        c1.setModelo("BIC");
        c1.setPonta(0.5f);

        System.out.println("Tenho uma caneta " + c1.getModelo() + " com ponta " + c1.getPonta());

        c1.status();
        c2.status();
    }
}