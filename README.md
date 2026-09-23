# exercicios-java

# Programação Orientada a Objetos - 1ª Etapa

Repositório com as soluções dos desafios práticos de Programação Orientada a Objetos (Java), estruturados de forma incremental de acordo com a progressão da disciplina.

---

## 📌 Sumário

* [Desafio 01 - Classes e Objetos](#desafio-01---classes-e-objetos)
* [Desafio 02 - Construtores](#desafio-02---construtores)
* [Desafio 03 - Encapsulamento e Herança](#desafio-03---encapsulamento-e-herança)
* [Desafio 04 - Membros Estáticos](#desafio-04---membros-estáticos)
* [Como Executar o Projeto](#como-executar-o-projeto)

---

## Desafio 01 - Classes e Objetos

> **Restrições da Etapa:** Uso exclusivo de classes simples, atributos diretos e métodos de instância. Sem construtores customizados, encapsulamento ou membros estáticos auxiliares.

### Exercício 1: Retângulo
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe estruturada conforme abaixo:

* **Classe:** `Retangulo`
  * **Atributos:** `largura: double`, `altura: double`
  * **Métodos:** `Area(): double`, `Perimetro(): double`, `Diagonal(): double`

**Exemplo de Execução:**
```text
Informe a altura e a largura do retângulo:
3.00
4.00
AREA = 12.00
PERIMETRO = 14.00
DIAGONAL = 5.00
```

---

### Exercício 2: Funcionário
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida:
1. Mostrar os dados do funcionário (nome e salário líquido).
2. Aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem).
3. Mostrar novamente os dados do funcionário.

**Exemplo de Execução:**
```text
Nome: Joao Silva
Salario Bruto: 6000.00
Imposto: 1000.00

Funcionario: Joao Silva, $ 5000.00

Percentual de aumento do salario? 10.0

Salario com aumento: Joao Silva, $ 5600.00
```

---

### Exercício 3: Student
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (o 1º trimestre vale 30 e o 2º e 3º valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (`PASS`) ou não (`FAILED`) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe `Student` para resolver este problema.

**Exemplo de Execução:**
```text
Entrada:
Alex Green
27.00
31.00
32.00

Saída:
FINAL GRADE = 90.00
PASS
```

---

## Desafio 02 - Construtores

> **Regra Geral:** Todas as classes devem possuir o construtor padrão e pelo menos dois construtores parametrizados (sobrecarga).

### Exercício 1: Produto em Estoque
Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
* Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque).
* Realizar uma entrada no estoque e mostrar novamente os dados do produto.
* Realizar uma saída no estoque e mostrar novamente os dados do produto.

**Exemplo de Execução:**
```text
Informe os dados do produto:
Nome: TV
Preco unitario: 900.00
Quantidade no estoque: 10
Dados do produto: TV, R$ 900.00, 10 unidades, Total: R$ 9000.00
Informe a quantidade de produtos a ser adicionado no estoque: 5
Estoque atualizado: TV, R$ 900.00, 15 unidades, Total: R$ 13500.00
Informe a quantidade de produtos a ser removido no estoque: 3
Dados atualizados: TV, $ 900.00, 12 unidades, Total: R$ 10800.00
```

---

### Exercício 2: Calculadora com Construtores
Desenvolva uma calculadora para executar as seguintes operações:
* Soma, subtração, multiplicação e divisão. A classe deve ter um método para calcular todas as operações.
* A calculadora deverá realizar operações apenas entre dois números.
* O usuário deve fornecer tanto os números quanto a operação que deve ser realizada.
* O programa deverá imprimir o resultado da seguinte forma: `numero1 operacao numero2 = resultado` (Ex: `10.0 * 20.0 = 200.00`).
* Adicione um construtor onde deverá ser passada a operação e os números a serem calculados na instanciação do objeto.
* A classe deve conter também o método construtor padrão.

**Exemplo de Execução:**
```text
Informe os números:
Primeiro número: 10.00
Segundo número: 20.00
Digite 1 para soma (+), 2 para subtração (-), 3 para multiplicação (*) e 4 para divisão (/)
Operação: 3
Resultado: 10.0 * 20.0 = 200.00
```

---

### Exercício 3: Pessoa
Criar a classe `Pessoa` com as seguintes características:
* **Atributos:** Dia, mês e ano de nascimento, nome da pessoa, sexo (F/M) e idade.
* **Métodos:** 
  * `calculaIdade()`: recebe a data atual em dia, mês e ano, calculando e armazenando a idade atual da pessoa no atributo `idade`.
  * `exibeDados()`: imprime os dados cadastrais e a idade calculada.

**Exemplo de Execução:**
```text
Informe os dados da pessoa:
Nome: Maria da Silva
Dia nascimento: 02
Mes nascimento: 10
Ano nascimento: 1990
Sexo: F

Informe a data atual:
Dia: 02
Mes: 10
Ano: 1990
```

---

## Desafio 03 - Encapsulamento e Herança

> **Conceitos:** Atributos privados/protegidos, Getters/Setters, reutilização de código via herança (`extends`), construtores derivados via `super(...)` e sobreposição de métodos (`@Override`).

### Exercício 1: Hierarquia Conta e ContaPoupanca
Implemente a classe `ContaPoupanca` estendendo a classe base `Conta`.
* **Superclasse `Conta`:**
  * Atributos: `numero: int`, `titular: String`, `saldo: double` (acesso protegido/métodos)
  * Métodos: `sacar(valorSaque: double)`, `depositar(valorDeposito: double)`
* **Subclasse `ContaPoupanca`:**
  * Atributos adicionais: `taxaJuros: double`
  * Métodos: `atualizarSaldo()`
  * O método `sacar(valorSaque)` deve ser sobrescrito na classe `ContaPoupanca`, de modo que seja descontado R$ 5,00 de taxa de serviço a cada saque realizado.

---

### Exercício 2: Hierarquia de Funcionários (PF e PJ)
Implemente as classes `Funcionario`, `FuncionarioPJ` e `FuncionarioPF` contendo métodos e atributos conforme a especificação:

* **Superclasse `Funcionario`:**
  * Atributos: `nome`, `salario`, `endereco`, `telefone`
  * Métodos: `imprimirDados()`
* **Subclasse `FuncionarioPJ`:**
  * Atributos adicionais: `cnpj`, `taxaISS`
  * Métodos: `calcularISS()`, `imprimirDados()` (sobrescrito)
* **Subclasse `FuncionarioPF`:**
  * Atributos adicionais: `cpf`, `taxaIR`
  * Métodos: `calcularIR()`, `imprimirDados()` (sobrescrito)

> **Nota:** O método `imprimirDados()` deve ser sobrescrito nas subclasses para imprimir tanto os dados comuns da superclasse quanto as características específicas de cada pessoa jurídica ou física.

---

## Desafio 04 - Membros Estáticos

> **Conceitos:** Métodos e constantes de classe (`static`), classes utilitárias sem necessidade de instanciação de objetos.

### Exercício 1: Calculadora Estática
Crie uma classe utilitária chamada `Calculadora` com todos os métodos estáticos, conforme o diagrama:
* `somar(num1: int, num2: int): int`
* `subtrair(num1: int, num2: int): int`
* `multiplicar(num1: int, num2: int): int`
* `dividir(num1: double, num2: double): double`
* `dolarParaReal(valorCompraDolar: double, cotacaoDolar: double): double`
* `valorPI(): double` (retornando o valor fixo $PI = 3.14159$)

Crie uma classe `Programa` com método `main` para invocar os métodos diretamente e imprimir os resultados.

---

### Exercício 2: Manipulação de Strings Estática
Crie uma classe utilitária chamada `ManipulacaoString` contendo métodos estáticos para as seguintes operações:
1. Contar o número de vogais em uma string.
2. Inverter uma string.
3. Verificar se uma string é um palíndromo (se a leitura de trás para frente é idêntica).

Na classe principal (`main`), solicite ao usuário a entrada de um texto, processe utilizando a classe criada e exiba os resultados.

**Exemplo de Execução:**
```text
Manipulação de Strings
Digite uma string: radar
Número de vogais na string: 2
String invertida: radar
É um palíndromo? Sim
```

---

## Como Executar o Projeto

### Pré-requisitos
* **Java Development Kit (JDK)** versão 11 ou superior instalado.

---

### 1. Obter os Arquivos do Projeto

Você pode obter o código de duas formas:

#### Opção A: Clonando via Git (Recomendado)
No terminal, execute:
```bash
git clone https://github.com/Guilhermegomeslima/exercicios-java.git
cd exercicios-java
```

#### Opção B: Baixando o arquivo .ZIP
1. No topo da página do repositório no GitHub, clique no botão verde **`< Code >`**.
2. Selecione a opção **Download ZIP**.
3. Extraia o arquivo `.zip` em uma pasta de sua preferência no seu computador.

---

### 2. Executando pelas IDEs / Editores

#### 🔹 Execução no Visual Studio Code (VS Code)
1. Abra o VS Code e vá em **File > Open Folder...** (ou `Ctrl + K, Ctrl + O`).
2. Selecione a pasta do repositório (ou a pasta do desafio específico).
3. Certifique-se de ter a extensão **Extension Pack for Java** (Microsoft) instalada.
4. Abra o arquivo principal que possui o método `main` (ex: `Programa.java` ou `App.java`).
5. Clique no botão **Run** que aparece logo acima do método `main` ou pressione `F5`.

#### 🔹 Execução no jGRASP
1. Abra o **jGRASP**.
2. No menu superior, vá em **File > Open** e navegue até a pasta do desafio desejado.
3. Abra primeiro as classes auxiliares/modelo (ex: `Conta.java`) e depois a classe principal (ex: `Programa.java`).
4. Com a classe principal aberta na tela:
   - Clique no ícone da **fita verde (Compile)** na barra de ferramentas superior para compilar.
   - Clique no ícone do **homem correndo (Run)** para executar o programa.

---

### 3. Execução via Terminal (Modo Manual)

Navegue até a pasta do desafio desejado e utilize os comandos nativos do Java:

```bash
# Entrar na pasta do desafio (exemplo: desafio-01)
cd desafio-01

# Compilar todas as classes Java da pasta
javac *.java

# Executar a classe principal (substitua 'Programa1' pelo nome da classe com o método main)
java Programa1
```