public abstract class Pessoa {
    public static int qtdPessoa;
    private String nome;
    private int idade;
    private int honra;
    Arma arma;

    public Pessoa() {
        Arma arma = new Arma();
    }

    public Pessoa(String nome, int idade, int honra) {
        this.nome = nome;
        this.idade = idade;
        this.honra = honra;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("idade: "+idade);
        System.out.println("honra: "+honra);
        System.out.println("Arma: "+arma.getTipo());


    }
    public abstract void orar();

    public static int getQtdPessoa() {
        return qtdPessoa;
    }

    public static void setQtdPessoa(int qtdPessoa) {
        Pessoa.qtdPessoa = qtdPessoa;
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

    public int getHonra() {
        return honra;
    }

    public void setHonra(int honra) {
        this.honra = honra;
    }


}
