# AP1_POO
PROGRAMAÇÃO ORIENTADA A OBJETOS - Primeira Atividade Prática - Avaliativa - AP1

Este repositório contém várias classes desenvolvidas em Java para praticar conceitos fundamentais da programação. Cada tarefa é descrita abaixo.

## Tarefas

### 1. Calculadora de Desconto / CalculadoraDesconto.java
A Calculadora de Desconto é uma ferramenta desenvolvida em Java que permite calcular o desconto e o preço final de um produto com base no valor do produto e na porcentagem de desconto fornecida.

Funcionalidades:
* Entrada de Dados: Utiliza a classe Scanner para receber o valor do produto e a porcentagem de desconto.
* Cálculo do Desconto: Calcula o valor do desconto aplicado ao produto com base na porcentagem fornecida.
* Cálculo do Preço Final: Determina o preço final do produto após aplicar o desconto.
* Exibição de Resultados: Apresenta o valor do desconto e o preço final do produto após aplicar o desconto.

### 2. Calculadora de ITBI / CalculadoraITBI.java
A Calculadora de Imposto sobre a Transmissão de Bens Imóveis (ITBI) é uma ferramenta desenvolvida em Java que permite calcular o valor do ITBI com base no valor da transação de um imóvel, no valor venal do imóvel e na porcentagem do imposto.

Funcionalidades:
* Entrada de Dados: Recebe o valor da transação do imóvel, o valor venal do imóvel e a porcentagem do imposto ITBI.
* Cálculo do ITBI: Determina o maior valor entre o valor da transação e o valor venal do imóvel e calcula o valor do ITBI com base nesse valor e na porcentagem do imposto.
* Exibição de Resultados: Apresenta o valor final do ITBI.

### 3. Sistema de Avaliação / SistemaAvaliacao.java
O Sistema de Avaliação é uma aplicação em Java desenvolvida para calcular a média de notas de duas provas e um trabalho, utilizando a classe JOptionPane para entrada de dados. Além disso, o programa indica se o aluno está aprovado ou reprovado com base na média calculada.

Funcionalidades:
* Entrada de Dados: Utiliza a classe JOptionPane para receber as notas da Prova 1, Prova 2 e do Trabalho, garantindo que as notas fornecidas estejam no intervalo de 0 a 10.
* Cálculo da Média: Calcula a média aritmética das notas das provas e do trabalho.
* Indicação de Aprovação: Verifica se a média é maior ou igual a 6 e exibe uma mensagem indicando se o aluno foi aprovado ou reprovado.

### 4. Calculadora de Aposentadoria / CalculadoraAposentadoria.java
Este programa em Java permite determinar se uma pessoa já pode se aposentar ou quantos anos faltam para isso, com base nas regras de aposentadoria por idade ou por tempo de contribuição.

**Regras de Aposentadoria:** Existem duas maneiras pelas quais uma pessoa pode se aposentar:

**Por Idade:** A pessoa pode se aposentar quando atingir uma certa idade mínima, que varia de acordo com o sexo.
+ Homens: A idade mínima para aposentadoria é de 65 anos.
+ Mulheres: A idade mínima para aposentadoria é de 62 anos.
  
**Por Tempo de Contribuição:** A pessoa pode se aposentar quando atingir um certo número de anos de contribuição ao sistema de previdência social, que também varia de acordo com o sexo.
+ Homens: O tempo mínimo de contribuição exigido é de 35 anos.
+ Mulheres: O tempo mínimo de contribuição exigido é de 30 anos.

Funcionalidades:
* Entrada de Dados: O programa solicita que o usuário insira a idade, o sexo (M para masculino, F para feminino) e o número de anos de contribuição para o sistema de previdência social.
* Verificação da Aposentadoria: Determina se a pessoa já pode se aposentar com base em duas condições:

  ``
  1 - Se o usuário atingiu a idade mínima para aposentadoria de acordo com o sexo.
  ``

  ``
  2 - Se o usuário atingiu o tempo mínimo de contribuição exigido para a aposentadoria de acordo com o sexo.
  ``
* Se a pessoa atender a qualquer uma das condições acima, o programa informará que ela já pode se aposentar.
* Caso contrário, o programa informará quantos anos faltam para que a pessoa possa se aposentar.

### 5. Circuito de Resistências / CircuitoResistencias.java
Este programa em Java permite calcular a resistência equivalente, a maior e a menor resistência de um circuito com quatro resistências ligadas em série.

Funcionalidades:
* Entrada de Dados: O programa solicita que o usuário insira os valores das quatro resistências ligadas em série.
* Cálculo da Resistência Equivalente: Calcula a resistência equivalente do circuito somando os valores das quatro resistências.
* Identificação da Maior e Menor Resistência: Determina a maior e a menor resistência entre os valores fornecidos.
* Exibição de Resultados: Apresenta a resistência equivalente, a maior e a menor resistência do circuito.

### 6. Sistema de login / SistemaLogin.java
Este programa simula um sistema de login simples utilizando a classe JOptionPane para interações com o usuário. O sistema permite três tentativas de login, após as quais o acesso é negado.

Funcionalidades
* Entrada de Dados: Solicita o nome de usuário e senha do usuário.
* Validação de Login: Compara os dados inseridos com os valores "java8".
* Tentativas de Login: Permite até três tentativas de login com mensagens de erro informativas a cada falha.
* Encerramento: Se o usuário clicar em "Cancelar" durante a solicitação de login ou senha, o programa é encerrado imediatamente com uma mensagem de cancelamento.
* Login Bem-Sucedido: Exibe uma mensagem e encerra o programa.
* Login ou Senha Incorretos: Exibe uma mensagem de erro e informa o número de tentativas restantes.
* Número Máximo de Tentativas: Após três tentativas falhas, exibe uma mensagem e encerra o programa.

## Instruções de Execução

Para compilar e executar qualquer um dos programas listados acima, siga as etapas abaixo:

1 -  **Abra o terminal ou prompt de comando.**

2 -  **Navegue até o diretório onde o arquivo Java está localizado.**
  ````
   cd caminho/para/seu/diretorio
  ````

3 - **Compile o arquivo Java usando o comando javac.**
````
 javac NomeDoArquivo.java
````
    
4 - **Execute o programa compilado usando o comando java.**
````
 java NomeDoArquivo
````
