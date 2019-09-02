package conej02;

import java.util.Random;
import javax.swing.JOptionPane;

public class Conej02 {

    public static void main(String[] args) {
        double sueldo;
        String categoria;
        
        Random random = new Random();
        
        sueldo = random.nextDouble()*50000;
        // sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Sueldo: "));
        
        categoria = JOptionPane.showInputDialog("Ingrese categoria A o B: ");
        
        // if("a".equalsIgnoreCase(categoria))
        // if(categoria.equalsIgnoreCase("a"))
        
        if ("a".equalsIgnoreCase(categoria)){
            sueldo = sueldo + (2*sueldo)/100;
        } else if ("b".equalsIgnoreCase(categoria)){
            sueldo = sueldo + (5*sueldo)/100;
        } else {
            JOptionPane.showMessageDialog(null, "Categoria invalida");
        }
        
        JOptionPane.showMessageDialog(null, "Su sueldo es de: "+sueldo);
        
    }
    
}
