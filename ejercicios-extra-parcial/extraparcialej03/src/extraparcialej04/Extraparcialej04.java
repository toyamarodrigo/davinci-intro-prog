package extraparcialej04;

import javax.swing.JOptionPane;

public class Extraparcialej04 {

    public static void main(String[] args) {

        /*
        Dado el pais, sexo y talle de producto, indicar su precio.
        
        Argentina y Uruguay
        Mujer: S 450, M 500, L 520
        Hombre: S 560, M 575, L 590
        
        Chile
        Mujer: S 410, M 460, L 475
        Hombre: S 500, M 525, L 530
        
        Brasil y Peru
        Mujer: S 425, M 450, L 480
        Hombre: S 520, M 545, L 575
         */
        String pais, sexo, talle;
        double precio;

        pais = JOptionPane.showInputDialog("Ingrese Pais: ");
        sexo = JOptionPane.showInputDialog("Ingrese sexo Masculino(m) o Femenino(f): ");
        talle = JOptionPane.showInputDialog("Ingrese Talle S, M o L: ");

        if (pais.equalsIgnoreCase("argentina") || pais.equalsIgnoreCase("uruguay")) {
            if (sexo.equalsIgnoreCase("m")) {
                if (talle.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "Talle: 560");
                } else if (talle.equalsIgnoreCase("m")) {
                    JOptionPane.showMessageDialog(null, "Talle: 575");
                } else if (talle.equalsIgnoreCase("l")) {
                    JOptionPane.showMessageDialog(null, "Talle: 590");
                } else {
                    JOptionPane.showMessageDialog(null, "Talle no disponible");
                }
            } else if (sexo.equalsIgnoreCase("f")) {
                if (talle.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "Talle: 450");
                } else if (talle.equalsIgnoreCase("m")) {
                    JOptionPane.showMessageDialog(null, "Talle: 500");
                } else if (talle.equalsIgnoreCase("l")) {
                    JOptionPane.showMessageDialog(null, "Talle: 520");
                } else {
                    JOptionPane.showMessageDialog(null, "Talle no disponible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, sexo no binario");
            }
        } else if (pais.equalsIgnoreCase("chile")) {
            if (sexo.equalsIgnoreCase("m")) {
                if (talle.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "Talle: 500");
                } else if (talle.equalsIgnoreCase("m")) {
                    JOptionPane.showMessageDialog(null, "Talle: 525");
                } else if (talle.equalsIgnoreCase("l")) {
                    JOptionPane.showMessageDialog(null, "Talle: 530");
                } else {
                    JOptionPane.showMessageDialog(null, "Talle no disponible");
                }
            } else if (sexo.equalsIgnoreCase("f")) {
                if (talle.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "Talle: 410");
                } else if (talle.equalsIgnoreCase("m")) {
                    JOptionPane.showMessageDialog(null, "Talle: 460");
                } else if (talle.equalsIgnoreCase("l")) {
                    JOptionPane.showMessageDialog(null, "Talle: 475");
                } else {
                    JOptionPane.showMessageDialog(null, "Talle no disponible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, sexo no binario");
            }
        } else if (pais.equalsIgnoreCase("brasil") || pais.equalsIgnoreCase("peru")) {
            if (sexo.equalsIgnoreCase("m")) {
                if (talle.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "Talle: 520");
                } else if (talle.equalsIgnoreCase("m")) {
                    JOptionPane.showMessageDialog(null, "Talle: 545");
                } else if (talle.equalsIgnoreCase("l")) {
                    JOptionPane.showMessageDialog(null, "Talle: 575");
                } else {
                    JOptionPane.showMessageDialog(null, "Talle no disponible");
                }
            } else if (sexo.equalsIgnoreCase("f")) {
                if (talle.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "Talle: 425");
                } else if (talle.equalsIgnoreCase("m")) {
                    JOptionPane.showMessageDialog(null, "Talle: 450");
                } else if (talle.equalsIgnoreCase("l")) {
                    JOptionPane.showMessageDialog(null, "Talle: 480");
                } else {
                    JOptionPane.showMessageDialog(null, "Talle no disponible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, sexo no binario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, pais no disponible");
        }
    }
}
