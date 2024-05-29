import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados e validação das resistências
        double resistencia1 = lerResistencia(scanner, "primeira");
        double resistencia2 = lerResistencia(scanner, "segunda");
        double resistencia3 = lerResistencia(scanner, "terceira");
        double resistencia4 = lerResistencia(scanner, "quarta");

        // Cálculo da resistência equivalente
        double resistenciaEquivalente = resistencia1 + resistencia2 + resistencia3 + resistencia4;

        // Identificação da maior resistência
        double maiorResistencia = Math.max(Math.max(resistencia1, resistencia2), Math.max(resistencia3, resistencia4));

        // Identificação da menor resistência
        double menorResistencia = Math.min(Math.min(resistencia1, resistencia2), Math.min(resistencia3, resistencia4));

        // Exibição de resultados
        System.out.println("Resistencia equivalente: " + resistenciaEquivalente);
        System.out.println("Maior resistencia: " + maiorResistencia);
        System.out.println("Menor resistencia: " + menorResistencia);

        scanner.close();
    }

    public static double lerResistencia(Scanner scanner, String nome) {
        double resistencia;
        do {
            System.out.println("Digite o valor da " + nome + " resistencia:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um valor valido para a resistencia.");
                scanner.next();
            }
            resistencia = scanner.nextDouble();
        } while (resistencia < 0);
        return resistencia;
    }
}
