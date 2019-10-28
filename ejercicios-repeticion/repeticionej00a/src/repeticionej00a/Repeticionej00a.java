package repeticionej00a;

import javax.swing.JOptionPane;

public class Repeticionej00a {

    public static void main(String[] args) {

        double n1, n2, p;

        for (int i = 1; i <= 10; i++) {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota1: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota2: "));

            p = (n1 + n2) / 2;
            
            JOptionPane.showMessageDialog(null, "Promedio: " + p);
            
        }

    }

}
