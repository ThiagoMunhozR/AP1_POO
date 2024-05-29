import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalculadoraITBI {
    public static void main(String[] args) {
        calcularITBI();
    }

    public static void calcularITBI() {
        double valorTransacao = 0;
        double valorVenal = 0;
        double porcentagemImposto = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        // Validar entrada do valor de transação
        boolean inputValido = false;
        while (!inputValido) {
            String valorTransacaoStr = JOptionPane.showInputDialog(null, "Digite o valor de transacao do imovel:");
            try {
                valorTransacao = Double.parseDouble(valorTransacaoStr);
                if (valorTransacao >= 0) {
                    inputValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "O valor de transacao deve ser positivo. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida. Digite um valor monetario válido.");
            }
        }

        // Validar entrada do valor venal
        inputValido = false; // Resetar a flag para a próxima entrada
        while (!inputValido) {
            String valorVenalStr = JOptionPane.showInputDialog(null, "Digite o valor venal do imovel:");
            try {
                valorVenal = Double.parseDouble(valorVenalStr);
                if (valorVenal >= 0) {
                    inputValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "O valor venal deve ser positivo. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida. Digite um valor monetario valido.");
            }
        }

        // Validar entrada da porcentagem do imposto
        inputValido = false;
        while (!inputValido) {
            String porcentagemImpostoStr = JOptionPane.showInputDialog(null, "Digite a porcentagem do imposto ITBI:");
            try {
                porcentagemImposto = Double.parseDouble(porcentagemImpostoStr);
                if (porcentagemImposto >= 0 && porcentagemImposto <= 100) {
                    inputValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "A porcentagem do imposto deve estar entre 0 e 100. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida. Digite uma porcentagem valida.");
            }
        }

        double maiorValor = Math.max(valorTransacao, valorVenal);
        double imposto = (maiorValor * porcentagemImposto) / 100;

        JOptionPane.showMessageDialog(null, "O valor do imposto ITBI: " + df.format(imposto) + " reais");
    }
}
