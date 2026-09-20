public class Programa1D3 {
   public static void main(String[] args){
      
      System.out.println("Conta 1 (Comum)");
      Conta conta1 = new Conta(1001, "Jose", 100.000);
      System.out.printf("Titular: %s%n", conta1.getTitular());
      System.out.printf("Numero: %d%n", conta1.getNumero());
      System.out.printf("Saldo: %.3f%n", conta1.getSaldo());
      conta1.sacar(50.000);
      System.out.printf("Saldo apos saque (com taxa de 5.0): %.3f%n", conta1.getSaldo());
      
      System.out.println("--------------------------------");
      
      System.out.println("Conta 2 (Empresarial)");
      ContaEmpresarial conta2 = new ContaEmpresarial(1002, "Guilherme", 300.000, 50.000);
      System.out.printf("Titular: %s%n", conta2.getTitular());
      System.out.printf("Numero: %d%n", conta2.getNumero());
      System.out.printf("Saldo: %.3f%n", conta2.getSaldo());
      System.out.printf("Limite: %.3f%n", conta2.getLimiteEmprestimo());
      conta2.sacar(100.000);
      System.out.printf("Saldo apos saque (sem taxa): %.3f%n", conta2.getSaldo());

      System.out.println("--------------------------------");

      System.out.println("Conta 3 (Poupanca)");
      ContaPoupanca conta3 = new ContaPoupanca(1003, "Erick", 500.000, 2.5);
      System.out.printf("Titular: %s%n", conta3.getTitular());
      System.out.printf("Numero: %d%n", conta3.getNumero());
      System.out.printf("Saldo inicial: %.3f%n", conta3.getSaldo());
      System.out.printf("Taxa de juros: %.2f%%%n", conta3.getTaxaJuros());
      conta3.atualizarSaldo();
      System.out.printf("Saldo apos rendimento: %.3f%n", conta3.getSaldo());
      conta3.sacar(100.000);
      System.out.printf("Saldo apos saque (com taxa de 5.0): %.3f%n", conta3.getSaldo());
   }
}