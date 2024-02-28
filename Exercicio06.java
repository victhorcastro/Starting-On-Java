// Idade em anos para dias

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        int anos, dias;

        // Entrada de dados
        anos = Integer.parseInt(
            JOptionPane.showInputDialog("Digite sua idade em anos: ")
        );
        dias = (anos*365);

         JOptionPane.showMessageDialog(null,"Sua idade em dias é de: " + dias + "dias.");
    }
    
}
