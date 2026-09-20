import java.util.Locale;
import java.util.Scanner;

public class Programa2D2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os números:");
        System.out.print("Primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite 1 para soma (+), 2 para subtração (-), 3 para multiplicação (*) e 4 para divisão (/)");
        System.out.print("Operação: ");
        int operacao = sc.nextInt();

        Calculadora calc = new Calculadora(n1, n2, operacao);

        System.out.printf("Resultado: %.1f %c %.1f = %.2f%n", 
                calc.n1, calc.obterSimboloOperacao(), calc.n2, calc.calcular());

        sc.close();
    }
}