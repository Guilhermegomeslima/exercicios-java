import java.util.Locale;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Informe a altura e a largura do retângulo:");
        ret.altura = sc.nextDouble();
        ret.largura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETRO = %.2f%n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());

        sc.close();
    }
}