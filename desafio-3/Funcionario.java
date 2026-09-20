public class Funcionario {
    private String nome;
    private double salario;
    private String endereco;
    private String telefone;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String endereco, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}