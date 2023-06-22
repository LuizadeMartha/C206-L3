public class Cliente {


    private String nome;
    private int idade;
    private String cpfCliente;
    private int QtdPessoas = 0;
    private String data ;


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getidade() {

        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getQtdPessoas() {
        return QtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.QtdPessoas = qtdPessoas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
