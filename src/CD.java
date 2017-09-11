import java.util.ArrayList;

public class CD {

        String nomeAlbum;
        String nomeArtista;
        String ano;

        //coleção de músicas
        private ArrayList<Musica> faixas;

    public CD(String nomeAlbum, String nomeArtista, String ano, ArrayList faixas) {
        this.nomeAlbum = nomeAlbum;
        this.nomeArtista = nomeArtista;
        this.ano = ano;
        this.faixas = faixas;
    }

    public ArrayList<Musica> getDados() {
        return faixas;
    }


    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public String getAno() {
        return ano;
    }

    public ArrayList<Musica> getFaixas() {
        return faixas;
    }
}
