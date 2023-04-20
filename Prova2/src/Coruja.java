public class Coruja extends Animal implements Alimentação {


    private String cor;


     public void voar(){
         System.out.println("Coruja voando!!!");

     }

    @Override
    public void mostraInfo() {
        //super.mostraInfo()+"Cor: " + cor;
        System.out.println("Quantidade de animais: "+getQntAnimais());
        System.out.println("nome: "+getNome());
        System.out.println("idade: "+getIdade());
        System.out.println("Perigoso: "+isPerigoso());
        System.out.println("Cor: "+cor);
    }

    @Override
    public void barulho() {
        System.out.println("Pruu Pruuu");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void comendo() {
        System.out.println("coruja comendo...");
    }
}
