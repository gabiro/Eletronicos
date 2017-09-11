
public class AparelhoDeSom extends Eletronico {

    int potencia;
    Player player;
    int volume;
    CDPlayer cdPlayer;
    USBPlayer usbPlayer;


    public AparelhoDeSom(int potencia, String marca, String modelo) {
        super(modelo, marca);
        cdPlayer = new CDPlayer(this);
        usbPlayer = new USBPlayer(this);
        this.potencia = potencia;
        this.player = null;
        this.volume = 0;
    }

    public int getPotencia() {
        return potencia;
    }

    public Player getCaixa() {
        return player;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        if (volume < 20) {
            this.volume = volume + 1;
        }
        exibirMensagemNoDisplay("Volume: " + volume);
    }

    public void diminuirVolume() {
        if (volume > 0) {
            this.volume = volume - 1;
        }
        exibirMensagemNoDisplay("Volume: " + volume);
    }

    enum TipoPlayer {
        CD,
        USB,
        Radio
    }


    public void alterarFuncao(TipoPlayer opcao) {
        switch (opcao) {
            case CD:
                player = cdPlayer;
                exibirMensagemNoDisplay("Selecionou CDPlayer");
                break;
            case USB:
                player = usbPlayer;
                exibirMensagemNoDisplay("Selecionou USBPlayer");
                break;
            case Radio:
                player = null;
                exibirMensagemNoDisplay("Selecionou Radio");
        }
    }

    public void exibirMensagemNoDisplay(String msg) {
        System.out.println(msg);
    }

    public CDPlayer getCDPlayer() {
        return cdPlayer;
    }

    public USBPlayer getUSBPlayer() {
        return usbPlayer;
    }


}


