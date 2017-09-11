public class Musica {

        String nomeMusica;
        String nomeArtista;
        String compositor;
        int tempo;

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getCompositor() {
        return compositor;
    }

    public int getTempo() {
        return tempo;
    }

    public Musica(String nomeMusica, String nomeArtista, String compositor, int tempo) {
        this.nomeMusica = nomeMusica;
        this.nomeArtista = nomeArtista;
        this.compositor = compositor;
        this.tempo = tempo;
    }
}