public final class Cavaleiro extends Pessoa implements  Patrulha, Consagra{

    private String casa;
    private String nomeEscudeiro;
    public String montaria;
    


    public Cavaleiro(String nome, int idade, int honra, String casa, String nomeEscudeiro, String montaria) {
        super(nome, idade, honra);
        this.casa = casa;
        this.nomeEscudeiro = nomeEscudeiro;
        this.montaria = montaria;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: " +getNome());
        System.out.println("Idade: " +getIdade());
        System.out.println("Honra: " +getHonra());
        System.out.println("Nome: "+nomeEscudeiro);
        System.out.println("Casa: "+casa);
        System.out.println("Montaria: "+montaria);
    }

    @Override
    public void orar() {
        System.out.println(getNome() + " Fez uma oracão ao Deus do fogo");

    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getNomeEscudeiro() {
        return nomeEscudeiro;
    }

    public void setNomeEscudeiro(String nomeEscudeiro) {
        this.nomeEscudeiro = nomeEscudeiro;
    }

    public String getMontaria() {
        return montaria;
    }

    public void setMontaria(String montaria) {
        this.montaria = montaria;
    }

    @Override
    public void consagrarCompanheiro() {
        System.out.println(getNome() +" Consagou um novo cavalheiro");
        setHonra(5);
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(getNome() +" fez uma patrulha pelo reino");

    }
}
