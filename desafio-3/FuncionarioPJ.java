public class FuncionarioPJ extends Funcionario {
    private String cnpj;
    private double taxaISS;

    public FuncionarioPJ() {
        super();
    }

    public FuncionarioPJ(String nome, double salario, String endereco, String telefone, String cnpj, double taxaISS) {
        super(nome, salario, endereco, telefone);
        this.cnpj = cnpj;
        this.taxaISS = taxaISS;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getTaxaISS() {
        return taxaISS;
    }

    public void setTaxaISS(double taxaISS) {
        this.taxaISS = taxaISS;
    }

    public double calcularISS() {
        return getSalario() * (taxaISS / 100.0);
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("CNPJ: " + cnpj);
        System.out.printf("Taxa ISS: %.2f%%%n", taxaISS);
        System.out.printf("Valor ISS: R$ %.2f%n", calcularISS());
    }
}