import java.security.spec.RSAOtherPrimeInfo;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String tipoDeFrase) {
        if (tipoDeFrase.equals("Agradável")) {
            System.out.println("Abanar e latir");
            this.emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int minuto) {
        if (hora < 12) {
            System.out.println("Abanar rabo");
        } else if (hora >= 18 ) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
            this.emitirSom();
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Abanar");
            }
        }
    }
}