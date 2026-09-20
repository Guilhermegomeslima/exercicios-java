public class Calculadora {
    public double n1;
    public double n2;
    public int operacao;

    public Calculadora() {
    }

    public Calculadora(double n1, double n2, int operacao) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
    }

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double calcular() {
        double resultado = 0.0;
        if (operacao == 1) {
            resultado = n1 + n2;
        } else if (operacao == 2) {
            resultado = n1 - n2;
        } else if (operacao == 3) {
            resultado = n1 * n2;
        } else if (operacao == 4) {
            if (n2 != 0) {
                resultado = n1 / n2;
            }
        }
        return resultado;
    }

    public char obterSimboloOperacao() {
        if (operacao == 1) return '+';
        if (operacao == 2) return '-';
        if (operacao == 3) return '*';
        if (operacao == 4) return '/';
        return '?';
    }
}