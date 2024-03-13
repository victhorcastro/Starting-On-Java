import javax.swing.JOptionPane;

public class ExemploWhile{
    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 1;

        while(contador <= 5){

            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

            double media = (nota1+nota2)/2;
            JOptionPane.showMessageDialog(null, "A média é " + media);

            // código que vai se repetir
            contador++; // contador = contador + 1
        }
    }
}