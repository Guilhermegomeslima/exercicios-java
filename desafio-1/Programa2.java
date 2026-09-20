import java.util.Locale;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println();
        System.out.printf("Funcionario: %s, $ %.2f%n", func.nome, func.salarioLiquido());

        System.out.println();
        System.out.print("Percentual de aumento do salario? ");
        double porcentagem = sc.nextDouble();
        func.aumentarSalario(porcentagem);

        System.out.println();
        System.out.printf("Salario com aumento: %s, $ %.2f%n", func.nome, func.salarioLiquido());

        sc.close();
    }
}