public class TesteControleRemoto {

    public static void main (String[] args){
       AparelhoDeSom aparelhoDeSom = new AparelhoDeSom(23, "Sony", "DET" );
       Computador computador = new Computador("GT", "ACER");
       Televisao televisao = new Televisao("ashgd", "CCE");

       ControleRemotoUniversal controleRemotoUniversal = new ControleRemotoUniversal();

        controleRemotoUniversal.ligar(televisao);
        controleRemotoUniversal.ligar(computador);
        controleRemotoUniversal.ligar(aparelhoDeSom);

        controleRemotoUniversal.desligar(televisao);
        controleRemotoUniversal.desligar(computador);
        controleRemotoUniversal.desligar(aparelhoDeSom);


    }
}
