public class Aula03 {
    public static void  main(String[] args) {
        Caneta2 c1 = new Caneta2();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; -> 'ponta' has private access in 'Caneta2'
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
}
