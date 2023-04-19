public class Main {
    public static void main(String[] args) {


        Guarda g1 = new Guarda("Lucas", 28, 23,100);
        g1.orar();
        g1.fazerPatrulha();
        g1.mostraInfo();

        Cavaleiro c1 = new Cavaleiro("Luiza", 25, 10,"34","lu", "no");
        c1.orar();
        c1.fazerPatrulha();
        c1.consagrarCompanheiro();
        c1.mostraInfo();

    }
}