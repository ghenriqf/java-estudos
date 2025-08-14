import java.util.Objects;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar () {
        if (this.aprovada) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor = 0;

            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado + " ganhou!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante + " ganhou!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }

        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }
}
