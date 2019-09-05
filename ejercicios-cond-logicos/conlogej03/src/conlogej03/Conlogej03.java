package conlogej03;

import javax.swing.JOptionPane;

/** @author Rodrigo Toyama <toyama.rodrigo@gmail.com> */
public class Conlogej03 {

    public static void main(String[] args) {

        /*
        Dados 2 números, se pide calcular la división solo en el caso que el 
        primero sea mayor que el segundo y el segundo distinto de 0.
        */
        
        int n1, n2, div;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n2: "));
        
        if (n1 > n2 && n2 != 0){
            div = n1/n2;
            JOptionPane.showMessageDialog(null, "Division: "+div);
        } else {
            JOptionPane.showMessageDialog(null, "No tengo permitido hacer la division, lo siento");
        }
        
    }
    
}
