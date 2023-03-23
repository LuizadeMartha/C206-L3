public class Main {
    public static void main(String[] args) {


        //CRIANDO DOIS OBJETO PARA ALUNO
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        //primeiro objeto
        a1.nome = "Luiza";
        a1.matricula = 13;
        a1.curso = "Eng computação";

        //criando o objeto do material [0] do meu aluno 1:
        a1.materias[0] = new Materia();
        a1.materias[0].nome = "Prog Orientada a obejtos";
        a1.materias[0].creditos = 6;
        a1.materias[0].sigla = "C206";

        //segundo objeto
        a2.nome = "Lucas";
        a2.matricula = 16;
        a2.curso = "Eng biomedica";

        a2.materias[1] = new Materia();
        a2.materias[1].nome = "fisica";
        a2.materias[1].creditos = 4;
        a2.materias[1].sigla = "F004";


        a1.exibirInfos();
        a2.exibirInfos();

        a1.totalCreditos();
        a2.totalCreditos();

        //exibindo informações de faculdade
        a1.faculdade.exibirInfos();

    }
}
