public abstract class Player {
    boolean tocando = false;
    protected int numMusica = 0;
    protected int tempo = 0;
 //protected Musica musicaAtual;

 //abstract method: apenas a assinatura
    abstract Musica getMusicaAtual();
    abstract AparelhoDeSom getAparelhoDeSom();

    public void play() {
        if(getMusicaAtual() == null){return;}
        tocando = true;
        numMusica = 0;                  //musicaAtual foi substituido por um método implementado nas classses filhas
        getAparelhoDeSom().exibirMensagemNoDisplay("Executando a música " + getMusicaAtual().getNomeMusica());

    }

    public void stop() {
        tocando = false;
        getAparelhoDeSom().exibirMensagemNoDisplay("Player parado");
    }

    public void avancarMusica() {
        numMusica = numMusica + 1;
        getAparelhoDeSom().exibirMensagemNoDisplay((numMusica + 1) + " - " + getMusicaAtual().getNomeMusica() + " - " + getMusicaAtual().getNomeArtista());
    }

    public void recuarMusica() {
        if (numMusica > 1) {
            numMusica = numMusica - 1;
        }
        getAparelhoDeSom().exibirMensagemNoDisplay((numMusica + 1) + " - " + getMusicaAtual().getNomeMusica() + " - " + getMusicaAtual().getNomeArtista());
    }
}
