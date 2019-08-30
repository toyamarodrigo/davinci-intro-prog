/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej04;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double matricula, c1, c2, c3, suma, prom;
        
        matricula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la matricula: "));
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la c1: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la c2: "));
        c3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la c3: "));
        suma = c1+c2+c3;
        prom = suma / 3;
        
        JOptionPane.showMessageDialog(null, "Su matricula es de: $" +matricula
                + "\ny su promedio es de: " +prom);
    }
    
}
