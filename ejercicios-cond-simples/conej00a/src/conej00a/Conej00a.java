package conej00a;

import javax.swing.JOptionPane;


public class Conej00a {

    public static void main(String[] args) {
        String m;
        
        m = JOptionPane.showInputDialog("Ingrese valor moneda cara || ceca");

        if (m.equalsIgnoreCase("cara")){
            JOptionPane.showMessageDialog(null, "La profesora trae caramelos");
        } else {
            JOptionPane.showMessageDialog(null, "Tienen parcialito");
        }
    }
    
}
