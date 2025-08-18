public class Visualizacao {
    private Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", video=" + video +
                '}';
    }

    public void avaliar(int nota) {
        if (nota > 5 || nota < 1) {
            System.out.println("Informe uma quantidade de estrelas válidas");
        } else {
            this.video.setAvaliacao(nota);
        }
    }

    public void avaliar(float porcentagem) {
        int tot = 0;
        if (porcentagem <= 20) {
            tot = 1;
        } else if (porcentagem <= 50) {
            tot = 3;
        } else {
            tot = 5;
        }
        this.video.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}