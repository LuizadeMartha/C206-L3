import org.w3c.dom.ls.LSOutput;

public class Guarda extends Pessoa implements Patrulha{

    private int coragem;


    public Guarda(String nome, int idade, int honra, int coragem) {
        super(nome, idade, honra);
        this.coragem = coragem;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome: " +getNome());
        System.out.println("Idade: " +getIdade());
        System.out.println("Honra: " +getHonra());
        System.out.println("coragem: " +this.coragem);

    }

    @Override
    public void orar() {
        System.out.println(getNome() + " Fez uma oracão ao seus amigos");
    }

    @Override
    public void fazerPatrulha() {
        System.out.println(getNome()+" Fez patrulha alem da muralha");
        coragem = 20;
    }
}