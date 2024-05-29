import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        int idade = obterIdade();
        char sexo = obterSexo();
        int anosContribuicao = obterAnosContribuicao(idade, sexo);

        verificarAposentadoria(idade, sexo, anosContribuicao);
    }

    public static int obterIdade() {
        int idade = -1;
        while (idade < 0 || idade > 150) {
            try {
                String input = JOptionPane.showInputDialog("Digite a idade:");
                idade = Integer.parseInt(input);
                if (idade < 0 || idade > 150) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira uma idade valida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira uma idade valida.");
            }
        }
        return idade;
    }

    public static char obterSexo() {
        char sexo = '\0';
        while (sexo != 'M' && sexo != 'F') {
            String input = JOptionPane.showInputDialog("Digite o sexo (M/F):");
            if (input.length() == 1 && (input.charAt(0) == 'M' || input.charAt(0) == 'F')) {
                sexo = input.charAt(0);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um sexo valido (M/F).");
            }
        }
        return sexo;
    }

    public static int obterAnosContribuicao(int idade, char sexo) {
        int anosContribuicao = -1;
        int tempoMinimoContribuicao = (sexo == 'M') ? 35 : 30;
        while (anosContribuicao < 0 || anosContribuicao > idade) {
            try {
                String input = JOptionPane.showInputDialog("Digite os anos de contribuicao:");
                anosContribuicao = Integer.parseInt(input);
                if (anosContribuicao > idade) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor valido para os anos de contribuicao.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor valido para os anos de contribuicao.");
            }
        }
        return anosContribuicao;
    }

    public static void verificarAposentadoria(int idade, char sexo, int anosContribuicao) {
        int idadeMinimaMulher = 62;
        int idadeMinimaHomem = 65;

        if ((sexo == 'M' && (anosContribuicao >= 35 || idade >= idadeMinimaHomem)) ||
    	    (sexo == 'F' && (anosContribuicao >= 30 || idade >= idadeMinimaMulher))) {
    		    JOptionPane.showMessageDialog(null, "Voce ja pode se aposentar.");
        } else {
    		    int idadeMinima = (sexo == 'M') ? idadeMinimaHomem : idadeMinimaMulher;
   	 	      int anosRestantesIdade = idadeMinima - idade;
    	 	    int anosRestantesContribuicao = (sexo == 'M') ? (35 - anosContribuicao) : (30 - anosContribuicao);
    	 	    int anosRestantes = Math.min(anosRestantesIdade, anosRestantesContribuicao);
    	 	    JOptionPane.showMessageDialog(null, "Faltam " + anosRestantes + " anos para voce se aposentar.");
	      }

    }
}
