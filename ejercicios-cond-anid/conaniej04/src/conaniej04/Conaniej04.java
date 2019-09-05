package conaniej04;

import javax.swing.JOptionPane;

public class Conaniej04 {

    public static void main(String[] args) {

        // Dados 3 números enteros ordenarlos en forma descendente.
        // Solo usando if statements
        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero3: "));

        if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: \nn1: " + n1 + "\nn2: " + n2 + "\nn3: " + n3);
        } else if (n1 >= n2 && n1 >= n3 && n2 <= n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: \nn1: " + n1 + "\nn3: " + n3 + "\nn2: " + n2);
        } else if (n2 >= n1 && n2 >= n3 && n1 >= n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: \nn2: " + n2 + "\nn1: " + n1 + "\nn3: " + n3);
        } else if (n2 >= n1 && n2 >= n3 && n1 <= n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: \nn2: " + n2 + "\nn3: " + n3 + "\nn1: " + n1);
        } else if (n3 >= n1 && n3 >= n2 && n1 <= n2) {
            JOptionPane.showMessageDialog(null, "Orden descendente: \nn3: " + n3 + "\nn2: " + n2 + "\nn1: " + n1);
        } else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {
            JOptionPane.showMessageDialog(null, "Orden descendente: \nn3: " + n3 + "\nn1: " + n1 + "\nn2: " + n2);
        }

        //Swaping
        
//        /* 
//            n1 = 1 
//            n2 = 2
//            n3 = 3
//        */
//        int temporal;
//        if (n1 < n2) {
//            temporal = n1;
//            // temporal = 1
//            n1 = n2;
//            // n1 = 2
//            n2 = temporal;
//            // n2 = 1
//            // [2,1,3]
//        }
//        if (n2 < n3) {
//            temporal = n2;
//            // temporal = 1
//            n2 = n3;
//            // n2 = 3
//            n3 = temporal;
//            // n3 = 1
//            // [2,3,1]
//        }
//
//        if (n1 < n2) {
//            temporal = n1;
//            // temporal = 2
//            n1 = n2;
//            // n1 = 3
//            n2 = temporal;
//            // n2 = 2
//            // [3,2,1]
//        }
    }

}
