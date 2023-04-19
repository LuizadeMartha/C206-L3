public abstract class Lorde extends Pessoa implements Consagra{

    private String casa;
    private int qtdVassalos;

    public Lorde(String nome, int idade, int honra, String casa) {
        super(nome, idade, honra);
        this.casa = casa;
        this.qtdVassalos = qtdVassalos;
    }


    @Override
    public void mostraInfo() {
        System.out.println("Nome: " +getNome());
        System.out.println("Idade: " +getIdade());
        System.out.println("Honra: " +getHonra());
        System.out.println("casa: "+casa);
        System.out.println("qtdVassalos; "+qtdVassalos);
    }

    @Override
    public void orar() {

        System.out.println(getNome() + "Fez uma oracão ao setes Deuses");
    }

    @Override
    public void consagrarCompanheiro() {
        System.out.println(getNome()+"Consagrou um novo companheiro");
        qtdVassalos++;
    }


}
