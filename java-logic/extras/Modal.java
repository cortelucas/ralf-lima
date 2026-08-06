import javax.swing.JOptionPane;

public class Modal {
    public static void main(String[] args) {
        
        // String mensagem = "Olá, seja bem-vindo(a)!";
        // JOptionPane.showMessageDialog(null, mensagem);

        // Obter dados
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");

        // Exibir dados
        String dados = "Nome: " + nome + "\nIdade: " + idade;
        JOptionPane.showMessageDialog(null, dados);

    }
}
