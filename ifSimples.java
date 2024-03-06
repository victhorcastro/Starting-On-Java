import javax.swing.JOptionPane;

public class ifSimples{
    public static void main(String[] args){

        // Declaração da Variável + Entrada de Dados
        double nota = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua nota: ")
        );

        // Estrutura de Seleção
        if(nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }else{ // nota < 70
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}