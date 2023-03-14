public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;
    Motor motor;

    Carro (){
        motor = new Motor();
    }

    void ligar(){
        System.out.println("Ligando carro " +modelo);
    }
    void acelerar(){
        System.out.println(modelo +" acelerando!!");
    }

    void mostraInfo(){
        System.out.println("Cor do carro: " +this.cor);
        System.out.println("Marca do carro: " +this.marca);
        System.out.println("Modelo do carro: " +this.modelo);
        System.out.println("Velocidade Maxima do carro: " +this.velocidadeMaxima);
        System.out.println("Velocidade Atual do carro: " +this.velocidadeAtual);
        System.out.println("Potência do motor: " +motor.potencia);
        System.out.println("Tipo do motor: " +motor.tipo);
    }

}
