public abstract class Player {
    boolean tocando = false;
    protected int numMusica = 0;
    protected int tempo = 0;

 //abstract method: apenas a assinatura
    abstract Musica getMusicaAtual();
    abstract AparelhoDeSom getAparelhoDeSom();

    public void play() {
        if(getMusicaAtual() == null){return;} //qdo não tem cd então não dá play
        tocando = true;
        numMusica = 0;   //posição inicial do Array: sempre toca a 1ª música   //musicaAtual foi substituido por um método implementado nas classses filhas
        getAparelhoDeSom().exibirMensagemNoDisplay("Executando a música " + getMusicaAtual().getNomeMusica());
    }

    public void stop() {
        tocando = false;
        getAparelhoDeSom().exibirMensagemNoDisplay("Player parado");
    }

    //cria um método abstrato no Player q retorna a qtde total de músicas
    //implementar o método concreto
    abstract int numeroDeFaixas();

    //template method: tá dentro do avancarMusica()
    protected void proximaFaixa(){
        if (numMusica < numeroDeFaixas() - 1) {
            numMusica = numMusica + 1;
        }
    }

    public void avancarMusica() {
        this.proximaFaixa();
        getAparelhoDeSom().exibirMensagemNoDisplay((numMusica + 1) + " - " + getMusicaAtual().getNomeMusica() + " - " + getMusicaAtual().getNomeArtista());
    }

    public void recuarMusica() {
        if (numMusica > 0) {
            numMusica = numMusica - 1;
        }
        getAparelhoDeSom().exibirMensagemNoDisplay((numMusica + 1) + " - " + getMusicaAtual().getNomeMusica() + " - " + getMusicaAtual().getNomeArtista());
    }
}
