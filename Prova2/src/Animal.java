public abstract class Animal {

    private static int qntAnimais;
    private String nome;
    private int idade;
    private boolean perigoso;
    Zoo zoo;

    Animal(){
        qntAnimais++;
    }
    public void mostraInfo(){
        System.out.println("Quantidade de animais: "+qntAnimais);
        System.out.println("nome: "+nome);
        System.out.println("idade: "+idade);
        System.out.println("Perigoso: "+perigoso);

    }

    public abstract void barulho();

    public int getQntAnimais() {
        return qntAnimais;
    }

    public void setQntAnimais(int qntAnimais) {
        this.qntAnimais = qntAnimais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
