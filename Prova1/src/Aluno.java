public class Aluno {

    String nome;
    int matricula;
    String curso;
    Materia [] materias = new Materia[10];
    Faculdade faculdade;
    int qtdCreditos =0;

    Aluno(){
        faculdade = new Faculdade("Inatel", "123");
    }

    int totalCreditos(){
        for(int i =0; i<materias.length; i++){
            if(materias[i] != null) {
                qtdCreditos += materias[i].creditos;
                System.out.println("Numero de creditos: " + qtdCreditos);

            }

        }
        return 0;
    }
    void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: "+curso);
        System.out.println("Matricula: "+matricula);
        for(int i =0; i < materias.length; i++){
            if(materias[i] != null){
                System.out.println("Nome: " +materias[i].nome);
                System.out.println("Curso: "+materias[i].sigla);
                System.out.println("Matricula: "+materias[i].creditos);
            }
        }
    }

}
