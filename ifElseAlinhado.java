import javax.swing.JOptionPane;

public class ifElseAlinhado {
    public static void main(String[] args) {
        double nota = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua nota:")
        );
        if(nota >= 90){
            JOptionPane.showMessageDialog(null, "Parabéns!!");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }else{
            if(nota >= 80){
                JOptionPane.showMessageDialog(null, "Conceito B");
            }else{ // nota < 80
                if (nota >70){
                    JOptionPane.showMessageDialog(null, "Conceito C");
                }else{ // nota < 70
                    JOptionPane.showMessageDialog(null, "Reprovado!");
                    }
        }
    }
}
}