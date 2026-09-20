import java.util.Locale;
import java.util.Scanner;

public class Programa1D2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do produto:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preco unitario: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("Dados do produto: " + produto.exibirDados());

        System.out.print("Informe a quantidade de produtos a ser adicionado no estoque: ");
        int qtdEntrada = sc.nextInt();
        produto.adicionarProdutos(qtdEntrada);
        System.out.println("Estoque atualizado: " + produto.exibirDados());

        System.out.print("Informe a quantidade de produtos a ser removido no estoque: ");
        int qtdSaida = sc.nextInt();
        produto.removerProdutos(qtdSaida);
        System.out.println("Dados atualizados: " + produto.exibirDados());

        sc.close();
    }
}