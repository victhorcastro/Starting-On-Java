import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        String output = "Primeiros 100 números naturais:\n";

        // Usando for
        /*for (int i = 0; i < 100; i++) {
            output += i + " ";
        }*/

        // Usando while
        /*int i = 0;
        while(i < 100){
          output += i + " ";
          i++;
        }*/

        // Usando do while
        /*int i = 0;
        do{
          output += i + " ";
          i++;
        }while (i < 100);*/
        
        JOptionPane.showMessageDialog(null, output);
    }





    }

