public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.cor = "Prata";
        c1.marca = "fiat";
        c1.modelo = "Palio";
        c1.velocidadeAtual = 60;
        c1.velocidadeMaxima = 120;
        c1.motor.tipo = "1.0";
        c1.motor.potencia = 100;

        c2.cor = "Preto";
        c2.marca = "Volkswagen";
        c2.modelo = "Jetta";
        c2.velocidadeAtual = 1000;
        c2.velocidadeMaxima =240;
        c2.motor.tipo = "2.0";
        c2.motor.potencia = 140;

        //mostrar info do carro 1
        System.out.println("Infos Carro 1");
        c1.mostraInfo();

        System.out.println("Infos Carro 2");
        //mostrar info do carro 2
        c2.mostraInfo();

        //Ações
        
        c1.ligar();
        c1.acelerar();

        c2.ligar();
        c2.acelerar();




    }
}
