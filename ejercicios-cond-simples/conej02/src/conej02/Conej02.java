package conej02;

import javax.swing.JOptionPane;

public class Conej02 {

    public static void main(String[] args) {
        double sueldo;
        String categoria;
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresar sueldo: "));
        categoria = JOptionPane.showInputDialog("Ingrese categoria A o B: ");
        
        if ("a".equals(categoria) || "A".equals(categoria)){
            sueldo = sueldo + (2*sueldo)/100;
        } else if ("b".equals(categoria) || "B".equals(categoria)){
            sueldo = sueldo + (5*sueldo)/100;
        } else {
            JOptionPane.showMessageDialog(null, "Categoria invalida");
        }
        
        JOptionPane.showMessageDialog(null, "Su sueldo es de: "+sueldo);
        
    }
    
}
