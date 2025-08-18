public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;


    @Override
    public void reproduzir() {
        if (!reproduzindo) {
            this.reproduzindo = true;
        } else {
            System.out.println("Vídeo está sendo já está reproduzido!");
        }
    }

    @Override
    public void pausar() {
        if (reproduzindo) {
            this.reproduzindo = false;
        } else {
            System.out.println("Vídeo está já está pausado!");
        }
    }

    @Override
    public void curtir() {
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
