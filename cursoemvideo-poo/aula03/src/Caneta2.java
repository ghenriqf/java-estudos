public class Caneta2 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro! Destampe a caneta para rabiscar.");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    protected void tampar() {
        this.tampada = true;
    }

    protected void destamapar() {
        this.tampada = false;
    }
}