public class Main {
    public static void main(String[] args) {


        Camiseta c1 = new Camiseta("Camiseta", 35, "Rosa", "M");
        c1.etiquetaPreco();
        System.out.println(c1.getCor());
        System.out.println(c1.getTamanho());

        Notebook n1 = new Notebook("Sansung",1800,"GTX", "Intel", 500);
        n1.etiquetaPreco();
        System.out.println(n1.getGpu());
        System.out.println(n1.getProcessador());
        System.out.println(n1.getArmanezamento());



    }

}
