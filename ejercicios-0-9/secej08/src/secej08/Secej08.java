/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej08;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double usd, convert;
        final double ars = 57.6;
        
        usd = Double.parseDouble(JOptionPane.showInputDialog("Ingrese dolares: "));
        convert = usd * 57.6;
        
        JOptionPane.showMessageDialog(null, "Dolares: " +usd
                +"\nPesos: " +convert);
        
    }
}
