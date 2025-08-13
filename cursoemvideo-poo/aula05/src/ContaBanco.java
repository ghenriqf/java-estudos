import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0f;
        this.numConta = 0;
    }

    public void abrirConta(String tipo, String nome) {
        this.dono = nome;
        this.numConta += 1;
        this.status = true;
        if (Objects.equals(tipo, "CC")) {
            this.saldo += 50;
        }
        else if (Objects.equals(tipo, "CP")) {
            this.saldo += 150;
        } else {
            System.out.println("ERRO: Tipo de conta invalido.");
        }
    }

    public void depositar(float deposito) {
         if (status) {
            this.saldo += deposito;
         } else {
             System.out.println("ERRO: Conta não ativa.");
        }
    }

    public void sacar(float saque) {
        if (status && saque >= this.saldo) {
            this.saldo -= saque;
        } else {
            System.out.println("ERRO: Saldo insuficiente");
        }
    }

    public void pagarMensal(String tipo) {
        if (Objects.equals(tipo, "CC")) {
            this.saldo -= 12;
        }
        else if (Objects.equals(tipo, "CP")) {
            this.saldo -= 20;
        } else {
            System.out.println("ERRO: Tipo de conta invalido.");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}