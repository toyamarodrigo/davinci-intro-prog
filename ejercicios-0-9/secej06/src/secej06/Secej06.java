/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej06;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double articulo, dinero, cambio;
        
        articulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor del articulo: "));
        dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese dinero entregado por cliente: "));
        cambio = dinero - articulo;
        
        JOptionPane.showMessageDialog(null, "Cambio: $" +cambio);
    }
    
}
