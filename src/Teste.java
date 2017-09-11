import java.util.ArrayList;

public class Teste {

    public static void main (String[] args){
        //set CD
        AparelhoDeSom XYZ =  new AparelhoDeSom(60, "Sony", "");


        //ligue XYZ
        XYZ.ligar();
        //aumentar volume 5 unidades
        XYZ.aumentarVolume();
        XYZ.aumentarVolume();
        XYZ.aumentarVolume();
        XYZ.aumentarVolume();
        XYZ.aumentarVolume();

        XYZ.alterarFuncao(AparelhoDeSom.TipoPlayer.CD);
        XYZ.getCaixa().play();


        //criar um novo objeto faixa, do tipo Musica, ANTES DO ARRAY, se colocar depois dá erro, pq o array vai querer add uma faixa que não existe
        Musica faixa1 = new Musica("Todo Carnaval tem seu fim", "Los Hermanos", "Marcelo Camelo", 252);
        Musica faixa2 = new Musica("A flor", "Los Hermanos", "Rodrigo Amarante", 210);
        Musica faixa3 = new Musica("Retrato pra Iaiá", "Los Hermanos","Marcelo Camelo", 282 );
        Musica faixa4 = new Musica("Assim será", "Los Hermanos", "Marcelo Camelo", 194 );
        Musica faixa5 = new Musica("Casa pré-fabricada", "Los Hermanos", "Marcelo Camelo",245);

        //criar um array de faixas
        ArrayList<Musica> faixas = new ArrayList<Musica>();
        faixas.add(faixa1);
        faixas.add(faixa2);
        faixas.add(faixa3);
        faixas.add(faixa4);
        faixas.add(faixa5);

        //criar CD
        CD cd = new CD("Bloco do eu sozinho", "Los Hermanos", "2001", faixas);

        //colocar cd
        XYZ.getCDPlayer().colocarCD(cd);

        //dar play no cd
        XYZ.getCaixa().play();
        XYZ.getCaixa().avancarMusica();
        XYZ.getCaixa().avancarMusica();
        XYZ.getCaixa().stop();
        XYZ.getCDPlayer().tirarCD();
        XYZ.alterarFuncao(AparelhoDeSom.TipoPlayer.Radio);
        XYZ.diminuirVolume();
        XYZ.diminuirVolume();
        XYZ.alterarFuncao(AparelhoDeSom.TipoPlayer.USB);

        // criar um novo objeto tipo Musica ANTES DO ARRAY, se colocar depois dá erro, pq o array vai querer add uma faixa que não existe
        faixa1 = new Musica("Pais e Filhos", "Legião Urbana", "Renato Russo", 330 );
        faixa2 = new Musica("All you need is love", "The Beatles", "John Lennon", 212 );
        faixa3 = new Musica("A flor", "Los Hermanos","Rodrigo Amarante", 210);
        faixa4 = new Musica("Construção", "Chico Buarque", "Chico Buarque", 280 );


        //criar um array de faixas
        faixas = new ArrayList<Musica>();
        faixas.add(faixa1);
        faixas.add(faixa2);
        faixas.add(faixa3);
        faixas.add(faixa4);

        XYZ.getUSBPlayer().colocarUSB(faixas);

        XYZ.getCaixa().avancarMusica();
        XYZ.getCaixa().avancarMusica();

        //aumentar o volume 30X
        for(int cont = 1; cont<=30; cont++) {
            XYZ.aumentarVolume();
        }

        for(int cont =1; cont <= 12; cont++) {
            XYZ.getCaixa().avancarMusica();
        }

        XYZ.desligar();


    }


}
