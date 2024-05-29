import javax.swing.JOptionPane;

public class SistemaAvaliacao {

    public static void main(String[] args) {
        double notaProva1 = obterNota("Prova 1");
        double notaProva2 = obterNota("Prova 2");
        double notaTrabalho = obterNota("Trabalho");

        double media = calcularMedia(notaProva1, notaProva2, notaTrabalho);

        exibirResultado(media);
    }

    public static double obterNota(String tipoNota) {
        double nota = -1;
        while (nota < 0 || nota > 10) {
            try {
                String input = JOptionPane.showInputDialog("Digite a nota da " + tipoNota + ":");
                nota = Double.parseDouble(input);
                if (nota < 0 || nota > 10) {
                    JOptionPane.showMessageDialog(null, "A nota deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um numero valido.");
            }
        }
        return nota;
    }

    public static double calcularMedia(double nota1, double nota2, double trabalho) {
        return (nota1 + nota2 + trabalho) / 3;
    }

    public static void exibirResultado(double media) {
        String mensagem;
        if (media >= 6) {
            mensagem = "Parabens! Voce foi aprovado com media: " + media;
        } else {
            mensagem = "Infelizmente voce foi reprovado com media: " + media;
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
