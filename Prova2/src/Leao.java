public class Leao extends Animal{

    private float tamanhoJuba;

    public void dormir(){
        System.out.println("Leao está dormindo!!!");
    }
    @Override
    public void mostraInfo() {
        //super.mostraInfo() +" Tamanho da juba: " + tamanhoJuba;
        System.out.println("Quantidade de animais: "+getQntAnimais());
        System.out.println("nome: "+getNome());
        System.out.println("idade: "+getIdade());
        System.out.println("Perigoso: "+isPerigoso());
        System.out.println("Tamanho da juba: "+tamanhoJuba);
    }

    @Override
    public void barulho() {
        System.out.println("Roar!");
    }


    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }
}
