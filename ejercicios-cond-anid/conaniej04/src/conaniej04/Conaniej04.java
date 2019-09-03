package conaniej04;

import javax.swing.JOptionPane;

public class Conaniej04 {

    public static void main(String[] args) {

        // Dados 3 números enteros ordenarlos en forma descendente.
        
        int n1, n2, n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero3: "));
        
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: n1: "+n1+"\nn2: "+n2+"\nn3: "+n3);
        } else if (n1 > n2 && n1 > n3 && n2 < n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: n1: "+n1+"\nn3: "+n3+"\nn2: "+n2);
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: n2: "+n2+"\nn1: "+n1+"\nn3: "+n3);
        } else if (n2 > n1 && n2 > n3 && n1 < n3) {
            JOptionPane.showMessageDialog(null, "Orden descendente: n2: "+n2+"\nn3: "+n3+"\nn1: "+n1);
        } else if (n3 > n1 && n3 > n2 && n1 < n2) {
            JOptionPane.showMessageDialog(null, "Orden descendente: n3: "+n3+"\nn2: "+n2+"\nn1: "+n1);
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            JOptionPane.showMessageDialog(null, "Orden descendente: n3: "+n3+"\nn1: "+n1+"\nn2: "+n2);
        } else if (n1 == n2 && n1 == n3) {
            JOptionPane.showMessageDialog(null, "los tres numeros son iguales");
        } else if (n1 == n2 && n1 > n3) {
            JOptionPane.showMessageDialog(null, "n1 y n2: "+n1+" "+n2+ "\nn3: "+n3);
        } else if (n1 == n2 && n1 < n3) {
            JOptionPane.showMessageDialog(null, "n3: "+n3+"\nn1 y n2: "+n1+" "+n2);
        } else if (n1 == n3 && n1 > n2){
            JOptionPane.showMessageDialog(null, "n1 y n3: "+n1+" "+n3+"\nn2: "+n2);
        } else if (n1 == n3 && n1 < n2){
            JOptionPane.showMessageDialog(null, "n2: "+n2+"\nn1 y n3: "+n1+" "+n3);
        }
        
        
    }
    
}
