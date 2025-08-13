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
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo, String nome) {
        this.dono = nome;
        this.status = true;
        if (Objects.equals(tipo, "CC")) {
            this.saldo = 50;
            this.tipo = tipo;
        }
        else if (Objects.equals(tipo, "CP")) {
            this.saldo = 150;
            this.tipo = tipo;
        } else {
            System.out.println("ERRO: Tipo de conta invalido.");
            return;
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.saldo == 0 && this.status) {
            this.status = false;
        }
        else {
            System.out.println("ERRO: Sua conta permanece ativa pois o saldo não esta zerado.");
        }
    }

    public void depositar(float deposito) {
         if (this.status) {
            this.saldo += deposito;
             System.out.println("Deposito realizado na conta de " + this.getDono());
         } else {
             System.out.println("ERRO: Conta não ativa.");
        }
    }

    public void sacar(float saque) {
        if (this.status){
            if (saque <= this.saldo) {
                this.saldo -= saque;
                System.out.println("Saque realizdo com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("ERRO: Saldo insuficiente.");
            }
        } else {
            System.out.println("ERRO: Conta inativa.");
        }
    }

    public void pagarMensal(String tipo) {
        if (this.status && saldo > 0){
            if (Objects.equals(tipo, "CC")) {
                this.saldo -= 12;
            } else if (Objects.equals(tipo, "CP")) {
                this.saldo -= 20;
            }
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