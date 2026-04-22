

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        if (A % 2 == 0){
            JOptionPane.showMessageDialog(null,"O número " + A + " é múltiplo de 2.");
        }else{
            JOptionPane.showMessageDialog(null,"O número " + A + " não é múltiplo de 2.");
        }
    }
}
