public class Gato extends Animal implements Alimentação{

    private String raca;


    public void correr(){
        System.out.println("Gato correndo!");
    }

    @Override
    public void mostraInfo() {
        //super.mostraInfo()+"Raça: "+raca;
        System.out.println("Quantidade de animais: "+getQntAnimais());
        System.out.println("nome: "+getNome());
        System.out.println("idade: "+getIdade());
        System.out.println("Perigoso: "+isPerigoso());
        System.out.println("Raça: "+raca);
    }

    @Override
    public void barulho() {
        System.out.println("miau");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void comendo() {
        System.out.println("Gato comendo..");
    }
}
