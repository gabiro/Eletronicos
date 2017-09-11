public class CDPlayer extends Player {
    AparelhoDeSom aparelhoDeSom;
    CD cdAtual;

    public CDPlayer(AparelhoDeSom aparelhoDeSom) {
        this.aparelhoDeSom = aparelhoDeSom;
    }

    @Override
    Musica getMusicaAtual() {
        if(cdAtual == null){return null;}
        return cdAtual.getFaixas().get(numMusica);
    }

    @Override
    public AparelhoDeSom getAparelhoDeSom() {
        return this.aparelhoDeSom;
    }

    public void colocarCD(CD cd) {
        cdAtual = cd;
        getAparelhoDeSom().exibirMensagemNoDisplay("Foi colocado o CD de " + cd.getNomeArtista());
    }

    public void tirarCD() {
        getAparelhoDeSom().exibirMensagemNoDisplay("Foi tirado o CD de " + cdAtual.getNomeArtista());
        cdAtual = null;
    }
}
