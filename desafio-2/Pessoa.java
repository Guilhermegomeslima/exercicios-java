public class Pessoa {
    public String nome;
    public char sexo;
    public int diaNascimento;
    public int mesNascimento;
    public int anoNascimento;
    public int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, char sexo, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        int calculoIdade = anoAtual - this.anoNascimento;
        if (mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            calculoIdade--;
        }
        this.idade = calculoIdade;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.printf("Data de Nascimento: %02d/%02d/%d%n", diaNascimento, mesNascimento, anoNascimento);
        System.out.println("Idade: " + idade + " anos");
    }
}