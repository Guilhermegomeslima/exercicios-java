import java.util.Locale;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("=== FUNCIONÁRIO BASE ===");
        Funcionario func = new Funcionario(
            "Carlos Drummond", 
            3500.00, 
            "Rua das Flores, 123", 
            "(31) 98888-1111"
        );
        func.imprimirDados();

        System.out.println("\n--------------------------------");

        System.out.println("=== FUNCIONÁRIO PESSOA JURÍDICA (PJ) ===");
        FuncionarioPJ funcPJ = new FuncionarioPJ(
            "Tech Solutions LTDA", 
            8000.00, 
            "Av. Paulista, 1000", 
            "(11) 97777-2222", 
            "12.345.678/0001-99", 
            5.0 
        );
        funcPJ.imprimirDados();

        System.out.println("\n--------------------------------");

        System.out.println("=== FUNCIONÁRIO PESSOA FÍSICA (PF) ===");
        FuncionarioPF funcPF = new FuncionarioPF(
            "Mariana Silva", 
            5000.00, 
            "Rua Minas Gerais, 45", 
            "(31) 96666-3333", 
            "123.456.789-00", 
            15.0 
        );
        funcPF.imprimirDados();
    }
}