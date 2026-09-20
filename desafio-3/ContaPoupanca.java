public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo() {
        saldo += saldo * (taxaJuros / 100.0);
    }

    @Override
    public void sacar(double valorSaque) {
        saldo -= valorSaque + 5.0;
    }
}