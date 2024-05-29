import java.util.Scanner;

public class GeradorDeTabuada {

    public static void main(String[] args) {
        gerarTabuada();
    }

    public static void gerarTabuada() {
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;
        int numero = 0;

        // Validar entrada do número para a tabuada
        while (!inputValido) {
            System.out.print("Digite um numero para gerar a tabuada: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                inputValido = true;
            } else {
                System.out.println("Entrada invalida. Por favor, digite um numero inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
