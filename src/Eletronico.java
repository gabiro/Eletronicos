public class Eletronico {

    private boolean ligado;
    private String modelo;
    private String marca;

    public Eletronico(String modelo, String marca) {
        this.ligado = false; //desligado
        this.modelo = modelo;
        this.marca = marca;
    }


    //indicador de ligado
    protected boolean Ligado() {
        return ligado;
    }

    protected void ligar() {
        this.ligado = true;
    }

    protected void desligar(){
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    //sem set para que não mude a marca e modelo
}
