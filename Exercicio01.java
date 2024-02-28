// Conversão de dólar para real

import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args){
        // Declaração de Variáveis
        double cotacaoDolar, valorDolares, valorReais;

        // Entrada de Dados
        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação: ")
        );

        valorDolares = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor em dolares: ")
        );

        // Processamento de Dados
        valorReais = valorDolares*cotacaoDolar;

        // Saída de Dados
        JOptionPane.showMessageDialog(null, "O valor em reais é: " + valorReais);
        
    }
}