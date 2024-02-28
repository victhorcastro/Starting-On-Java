// Exercicio sobre valor antecessor

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        int valor, antecessor;
        
        // Entrada de Dados
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado: ")
        );

        antecessor = (valor - 1);

        JOptionPane.showMessageDialog(null,"O valor antecessor é: " + antecessor);


    }
}
