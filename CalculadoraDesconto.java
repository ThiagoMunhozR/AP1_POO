import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calcularDesconto(scanner);
        scanner.close();
    }

    public static void calcularDesconto(Scanner scanner) {
        double valorProduto = 0;
        double porcentagemDesconto = 0;
        boolean inputValido = false;
        DecimalFormat df = new DecimalFormat("0.00");

        // Validar entrada do valor do produto
        while (!inputValido) {
            System.out.print("Digite o valor do produto: ");
            if (scanner.hasNextDouble()) {
                valorProduto = scanner.nextDouble();
                if (valorProduto >= 0) {
                    inputValido = true;
                } else {
                    System.out.println("Valor do produto deve ser positivo. Tente novamente.");
                    System.out.println(); // Adiciona uma linha em branco
                }
            } else {
                System.out.println("Entrada inválida. Digite um valor monetário válido.");
                System.out.println(); // Adiciona uma linha em branco
                scanner.next();
            }
        }

        inputValido = false; 

        // Validar entrada da porcentagem de desconto
        while (!inputValido) {
            System.out.print("Digite a porcentagem de desconto: ");
            if (scanner.hasNextDouble()) {
                porcentagemDesconto = scanner.nextDouble();
                if (porcentagemDesconto >= 0 && porcentagemDesconto <= 100) {
                    inputValido = true;
                } else {
                    System.out.println("A porcentagem de desconto deve estar entre 0 e 100. Tente novamente.");
                    System.out.println(); // Adiciona uma linha em branco
                }
            } else {
                System.out.println("Entrada inválida. Digite uma porcentagem válida.");
                System.out.println(); // Adiciona uma linha em branco
                scanner.next(); 
            }
        }

        double valorDesconto = (valorProduto * porcentagemDesconto) / 100;
        double precoFinal = valorProduto - valorDesconto;

        System.out.println(); // Adiciona uma linha em branco
        System.out.println("Valor do desconto: " + df.format(valorDesconto) + " reais");
        System.out.println("Preço final do produto: " + df.format(precoFinal) + " reais");
    }
}
