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

    //abstract method
    @Override
    public AparelhoDeSom getAparelhoDeSom() {
        return this.aparelhoDeSom;
    }

    @Override
    public void avancarMusica() {
        if (numMusica == usbAtual.size()-1) {
            numMusica = -1;
        }
        super.avancarMusica();
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

