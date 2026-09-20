public class ContaEmpresarial extends Conta {
   private double limiteEmprestimo;
   
   public ContaEmpresarial(int numero, String titular, double saldo, double limiteEmprestimo){
      super(numero, titular, saldo);
      this.limiteEmprestimo = limiteEmprestimo;
   }
   
   public double getLimiteEmprestimo(){
      return limiteEmprestimo;
   }
   
   public void setLimiteEmprestimo(double limiteEmprestimo){
      this.limiteEmprestimo = limiteEmprestimo;
   }
   
   @Override
   public void sacar(double valorSaque) {
		saldo -= valorSaque;
	}

}