import java.util.Scanner;

public class ProgramaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Manipulação de Strings");
        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();

        int vogais = ManipulacaoString.contarVogais(entrada);
        String invertida = ManipulacaoString.inverter(entrada);
        boolean palindromo = ManipulacaoString.isPalindromo(entrada);

        System.out.println("Número de vogais na string: " + vogais);
        System.out.println("String invertida: " + invertida);
        System.out.println("É um palíndromo? " + (palindromo ? "Sim" : "Não"));

        sc.close();
    }
}