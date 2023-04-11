public class Main {
    public static void main(String[] args) {


        Camiseta c1 = new Camiseta("Camiseta", 35, "Rosa", "M");
        c1.getCor();
        c1.getTamanho();
        c1.etiquetaPreco();

        Notebook n1 = new Notebook("Sansung",1800,"GTX", "Intel", 500);
        n1.getGpu();
        n1.getProcessador();
        n1.getArmanezamento();
        n1.etiquetaPreco();


    }

}
