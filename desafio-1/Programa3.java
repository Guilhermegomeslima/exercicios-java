import java.util.Locale;
import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante aluno = new Estudante();

        System.out.print("Nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Nota do 1º trimestre (máx. 30): ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("Nota do 2º trimestre (máx. 35): ");
        aluno.nota2 = sc.nextDouble();

        System.out.print("Nota do 3º trimestre (máx. 35): ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.pontosFaltantes());
        }

        sc.close();
    }
}