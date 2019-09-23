package conlogej03;

import javax.swing.JOptionPane;

public class Conlogej03 {

    public static void main(String[] args) {
        /*
        Dados 2 números, se pide calcular la división solo en el caso que 
        el primero sea mayor que el segundo y el segundo distinto de 0.
         */
        double n1, n2, div;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese n1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese n2: "));

        if (n1 > n2 && n2 != 0) {
            div = n1 / n2;
            JOptionPane.showMessageDialog(null, "Division: " + div);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede sorry");
        }
    }

}
