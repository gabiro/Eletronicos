import java.util.ArrayList;

public class USBPlayer extends Player {

    ArrayList<Musica> usbAtual;
    AparelhoDeSom aparelhoDeSom;

    public USBPlayer(AparelhoDeSom aparelhoDeSom) {
        this.aparelhoDeSom = aparelhoDeSom;
    }

    //abstract method: codificando
    @Override
    Musica getMusicaAtual() {
        return usbAtual.get(numMusica);
    }

    @Override
    public int numeroDeFaixas(){
        return usbAtual.size();
    }

    //abstract method
    @Override
    public AparelhoDeSom getAparelhoDeSom() {
        return this.aparelhoDeSom;
    }

    @Override
    public void proximaFaixa() {
        //se tiver na última música
        if (numMusica == usbAtual.size()-1){ //size()-1: útimo elemento do array
            numMusica = 0; //recebe a primeira posição
        }
        else super.proximaFaixa();
    }


    @Override
    public void recuarMusica() {

        if (numMusica == 0) {
            numMusica = usbAtual.size()-1;
        }
        super.recuarMusica();
    }

    public void colocarUSB(ArrayList<Musica> usb) {
        usbAtual = usb;
    }
}

