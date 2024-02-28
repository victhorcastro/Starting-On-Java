// Calcular área do retângulo

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        // Declaração de Variáveis
        double base, altura, area;

        // Entrada de Dados
        base = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor da base: ")
        );

        altura = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor da altura: ")
        );

        area = (base*altura);

        JOptionPane.showMessageDialog(null,"A Área do retângulo será de: " + area);
    }
    
}
