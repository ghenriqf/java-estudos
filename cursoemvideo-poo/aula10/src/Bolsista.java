public final class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.nome + " renovada com sucesso!");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista, pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}