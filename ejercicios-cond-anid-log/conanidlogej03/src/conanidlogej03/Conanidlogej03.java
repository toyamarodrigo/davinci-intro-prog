package conanidlogej03;

import javax.swing.JOptionPane;

public class Conanidlogej03 {

    public static void main(String[] args) {

        /*
        Dados 3 números enteros ordenarlos en forma ascendente
        */
     
        int n1, n2, n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero3: "));
        
        if (n1 > n2 && n1 > n3) {
            if ( n2 > n3 ) {
                JOptionPane.showMessageDialog(null, "Orden Descendente: \nn1: "+n1+"\nn2: "+n2+"\nn3: "+n3);
            } else {
                JOptionPane.showMessageDialog(null, "Orden Descendente: \nn1: "+n1+"\nn3: "+n3+"\nn2: "+n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            if(n1 > n3){
                JOptionPane.showMessageDialog(null, "Orden Descendente: \nn2: "+n2+"\nn1: "+n1+"\nn3: "+n3);
            } else {
                JOptionPane.showMessageDialog(null, "Orden Descendente: \nn2: "+n2+"\nn3: "+n3+"\nn1: "+n1);
            }
        } else {
            if (n1 > n2){
                JOptionPane.showMessageDialog(null, "Orden Descendente: \nn3: "+n3+"\nn1: "+n1+"\nn2: "+n2);
            } else {
                JOptionPane.showMessageDialog(null, "Orden Descendente: \nn3: "+n3+"\nn2: "+n2+"\nn1: "+n1);
            }
        }
    }
    
}
