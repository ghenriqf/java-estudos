public final class Tecnico extends Aluno{
    private int registro;

    public void praticar() {
        System.out.println("Pratica realizada!");
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
}
