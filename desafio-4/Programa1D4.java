import java.util.Locale;

public class Programa1D4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("--- Teste dos Métodos Estáticos da Calculadora ---");
        System.out.println("Soma (10 + 5): " + Calculadora.somar(10, 5));
        System.out.println("Subtração (10 - 5): " + Calculadora.subtrair(10, 5));
        System.out.println("Multiplicação (10 * 5): " + Calculadora.multiplicar(10, 5));
        System.out.printf("Divisão (10.0 / 4.0): %.2f%n", Calculadora.dividir(10.0, 4.0));
        System.out.printf("Dólar para Real ($50.00 a R$ 5.20): R$ %.2f%n", Calculadora.dolarParaReal(50.0, 5.20));
        System.out.println("Valor de PI: " + Calculadora.valorPI());
    }
}