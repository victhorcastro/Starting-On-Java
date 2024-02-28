// Exercicio de comissão, 5%

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double comissao, preco;
        int quantidade;

        preco = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o preço das peças: ")
        );

        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida: ")
        );

        comissao = (preco*quantidade)*0.05;

        JOptionPane.showMessageDialog(null, "A sua comissão é " + comissao);
    }

    
}
