public class Calculadora {

    public static final double PI = 3.14159;

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero.");
            return 0.0;
        }
        return num1 / num2;
    }

    public static double dolarParaReal(double valorCompraDolar, double cotacaoDolar) {
        return valorCompraDolar * cotacaoDolar;
    }

    public static double valorPI() {
        return PI;
    }
}