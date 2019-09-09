package conaniej02;

import javax.swing.JOptionPane;

public class Conaniej02 {

    public static void main(String[] args) {
        
        /*
        Dados 3 números, si el primero es mayor que el segundo pero menor 
        que el tercero se debe sumar los tres datos, en cualquier 
        otro caso se multiplicaran.
        */
        
        // si n1 > n2 y n1 < n3 => n1 + n2 + n3
        // sino n1 * n2 * n3
        
        int n1,n2,n3,sum,mult;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 3: "));
        
        if ( n1 > n2 && n1 < n3 ) {
            sum = n1 + n2 + n3;
            JOptionPane.showMessageDialog(null, "Total:(suma) " +sum);
        } else {
            mult = n1 * n2 * n3;
            JOptionPane.showMessageDialog(null, "Total:(multi) " +mult);
        }
        
    }
    
}