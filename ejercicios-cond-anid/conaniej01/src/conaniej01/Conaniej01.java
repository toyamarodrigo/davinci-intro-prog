package conaniej01;

import javax.swing.JOptionPane;

public class Conaniej01 {

    public static void main(String[] args) {
        
        // A = 15%
        // B = 10%
        // C = 5%
        
        double sueldo, catA, catB, catC;
        String cat;
        
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo de trabajor: "));
        cat = JOptionPane.showInputDialog("Ingrese categoria del trabajor: (A,B,C)");
        
        catA = sueldo + (sueldo*15)/100;
        catB = sueldo + (sueldo*10)/100;
        catC = sueldo + (sueldo*5)/100;
        
        
        if(cat.equalsIgnoreCase("a")) {
            JOptionPane.showMessageDialog(null, "Sueldo categoria A: " + catA);
        } else if (cat.equalsIgnoreCase("b")) {
            JOptionPane.showMessageDialog(null, "Sueldo categoria B: " + catB);
        } else {
            JOptionPane.showMessageDialog(null, "Sueldo categoria C: " + catC);
        }
        
        
        

    }
    
}