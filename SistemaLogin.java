import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void main(String[] args) {
        int tentativas = 3;

        // Loop para as tentativas de login
        while (tentativas > 0) {
            String usuario = JOptionPane.showInputDialog(null, "Por favor, faca o login:\nUsuario:");
            
            // Verifica se o usuário clicou em "Cancelar"
            if (usuario == null) {
                JOptionPane.showMessageDialog(null, "Acesso cancelado. \nO programa sera encerrado.");
                return; 
            }
            
            String senha = JOptionPane.showInputDialog(null, "Senha:");

	          // Verifica se o usuário clicou em "Cancelar"
            if (senha == null) {
                JOptionPane.showMessageDialog(null, "Acesso cancelado. \nO programa sera encerrado.");
                return; 
            }

            // Verificação do login e senha
            if ("java8".equals(usuario) && "java8".equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tente novamente. \nTentativas restantes: " + tentativas);
                } else {
                    JOptionPane.showMessageDialog(null, "Voce excedeu o numero maximo de tentativas. \nAcesso negado.");
                }
            }
        }
    }
}
