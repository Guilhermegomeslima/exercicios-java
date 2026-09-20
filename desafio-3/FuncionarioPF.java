public class FuncionarioPF extends Funcionario {
    private String cpf;
    private double taxaIR;

    public FuncionarioPF() {
        super();
    }

    public FuncionarioPF(String nome, double salario, String endereco, String telefone, String cpf, double taxaIR) {
        super(nome, salario, endereco, telefone);
        this.cpf = cpf;
        this.taxaIR = taxaIR;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getTaxaIR() {
        return taxaIR;
    }

    public void setTaxaIR(double taxaIR) {
        this.taxaIR = taxaIR;
    }

    public double calcularIR() {
        return getSalario() * (taxaIR / 100.0);
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("CPF: " + cpf);
        System.out.printf("Taxa IR: %.2f%%%n", taxaIR);
        System.out.printf("Valor IR: R$ %.2f%n", calcularIR());
    }
}