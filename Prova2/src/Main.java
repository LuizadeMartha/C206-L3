public class Main {
    public static void main(String[] args) {


        Coruja bixo1 = new Coruja();
        bixo1.setCor("Marrom");
        bixo1.setNome("Coruja");
        bixo1.setIdade(12);
        bixo1.setPerigoso(false);
        bixo1.setQntAnimais(3);



        Leao bixo2 = new Leao();
        bixo2.setTamanhoJuba(1);
        bixo2.setNome("Leao");
        bixo2.setIdade(8);
        bixo2.setPerigoso(true);
        bixo2.setQntAnimais(1);


        Gato bixo3 = new Gato();
        bixo3.setRaca("pintado");
        bixo3.setNome("Gato");
        bixo3.setIdade(7);
        bixo3.setPerigoso(false);
        bixo3.setQntAnimais(5);

        Zoo zoo = new Zoo();
        zoo.setNome("Zoologico");
        zoo.setEndereco("Rua 345");
        zoo.setCnpj(2345);
        zoo.mostraInfo();
        System.out.println("____________________________");

        zoo.getBixo()[0] =bixo1;
        zoo.getBixo()[1] =bixo2;
        zoo.getBixo()[2]= bixo3;

        //Lendo um array de bichos
        for (int i = 0; i < zoo.getBixo().length; i++) {
            if (zoo.getBixo()[i] != null) {
                System.out.println(zoo.getBixo()[i].getNome());
                System.out.println(zoo.getBixo()[i].getIdade());
                System.out.println(zoo.getBixo()[i].getQntAnimais());
                System.out.println(zoo.getBixo()[i].isPerigoso());
                //POLIMORFISMO
                if (zoo.getBixo()[i] instanceof Coruja) {
                    Coruja coruja_aux = (Coruja) zoo.getBixo()[i];
                    System.out.println(coruja_aux.getCor());
                } else if (zoo.getBixo()[i] instanceof Leao) {
                    Leao leao_aux = (Leao) zoo.getBixo()[i];
                    System.out.println(leao_aux.getTamanhoJuba());
                }else if (zoo.getBixo()[i] instanceof Gato) {
                    Gato gato_aux = (Gato) zoo.getBixo()[i];
                    System.out.println(gato_aux.getRaca());
                }

            }
        }
    }
}
