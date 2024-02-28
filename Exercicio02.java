// Quadrado de 4 números

import javax.swing.JOptionPane;

public class Exercicio02 { 
    public static void main(String[] args) {
        // Declaração de Variáveis
        double n1, n2, n3, n4, somaQuadrados;

        // Entrada de Dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));

        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));

        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));

        //somaQuadrados = n1*n1 + n2*n2 + n3*n3 + n4*n4
        somaQuadrados = Math.pow(n1,2) + Math.pow(n2,2) + Math.pow(n3,2) + Math.pow(n4,2);

        JOptionPane.showMessageDialog(null, "A soma dos quadrados é: " + somaQuadrados);
    }

}
