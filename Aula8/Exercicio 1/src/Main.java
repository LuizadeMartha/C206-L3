public class Main {
    public static void main(String[] args) {

        Sedan s1 = new Sedan(170000, "Prata", 2020, 2);
        s1.taxa();
        System.out.println();
        s1.mostraInnfo();
        System.out.println();

        Suv suv = new Suv(20000, "Preto", 2019, "20");
        suv.taxa();
        System.out.println();
        suv.mostraInnfo();
        System.out.println();

        Hatch hatch = new Hatch(300000, "Branco", 2017, 4);
        hatch.taxa();
        System.out.println();
        hatch.mostraInnfo();
        System.out.println();



    }
}