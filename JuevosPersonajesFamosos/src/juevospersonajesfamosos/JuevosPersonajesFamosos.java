package juevospersonajesfamosos;

import javax.swing.JOptionPane;

public class JuevosPersonajesFamosos {

    public static void main(String[] args) {

        String pjs, preg1, preg2, preg3, res;

        pjs = "Susana Giménez "
                + "\nDiego Maradona "
                + "\nCarlos Menem "
                + "\nLilita Carrió "
                + "\nDomingo Sarmiento";

        JOptionPane.showMessageDialog(null, pjs);

        // Forma 1
        preg1 = JOptionPane.showInputDialog("Esta vivo?");
        preg2 = JOptionPane.showInputDialog("Es mujer?");
        preg3 = JOptionPane.showInputDialog("Es politico?");

        if ("si".equalsIgnoreCase(preg1)) {
            if ("si".equalsIgnoreCase(preg2)) {
                if ("si".equalsIgnoreCase(preg3)) {
                    JOptionPane.showMessageDialog(null, "Lilita Carrió");
                } else {
                    JOptionPane.showMessageDialog(null, "Susana Giménez");
                }
            } else {
                if ("si".equalsIgnoreCase(preg3)) {
                    JOptionPane.showMessageDialog(null, "Carlos Menem");
                } else {
                    JOptionPane.showMessageDialog(null, "Diego Maradona");
                }
            }
        } else {
            if ("si".equalsIgnoreCase(preg2)) {
                if ("si".equalsIgnoreCase(preg3)) {
                    JOptionPane.showMessageDialog(null, "No existe personaje");
                } else {
                    JOptionPane.showMessageDialog(null, "No existe personaje");
                }
            } else {
                if ("si".equalsIgnoreCase(preg3)) {
                    JOptionPane.showMessageDialog(null, "No existe personaje");
                } else {
                    JOptionPane.showMessageDialog(null, "No existe personaje");
                }
            }
        }

        /*
        // Forma 2
        
        preg1 = JOptionPane.showInputDialog("Esta vivo?");
        preg2 = JOptionPane.showInputDialog("Es mujer?");
        preg3 = JOptionPane.showInputDialog("Es politico?");
        
        if ("si".equalsIgnoreCase(preg1) && "si".equalsIgnoreCase(preg2) && "si".equalsIgnoreCase(preg3)) {
            JOptionPane.showMessageDialog(null, "Lilita Carrió");
        } else if ("si".equalsIgnoreCase(preg1) && "si".equalsIgnoreCase(preg2) && "no".equalsIgnoreCase(preg3)){
            JOptionPane.showMessageDialog(null, "Susana Giménez");
        } else if ("si".equalsIgnoreCase(preg1) && "no".equalsIgnoreCase(preg2) && "no".equalsIgnoreCase(preg3)){
            JOptionPane.showMessageDialog(null, "Diego Maradona");
        } else if ("si".equalsIgnoreCase(preg1) && "no".equalsIgnoreCase(preg2) && "si".equalsIgnoreCase(preg3)){
            JOptionPane.showMessageDialog(null, "Carlos Menem");
        } else if ("no".equalsIgnoreCase(preg1) && "no".equalsIgnoreCase(preg2) && "no".equalsIgnoreCase(preg3)){
            JOptionPane.showMessageDialog(null, "Domingo Sarmiento");
        } else {
            JOptionPane.showMessageDialog(null, "No existe personaje");
        }
         */
    }
}
