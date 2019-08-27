/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej05;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cant, cd, tot;
        
        cant = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cant de cajas de discos: "));
        
        cd = cant * 10;
        tot = cant * 5.80;
        
        JOptionPane.showMessageDialog(null, "Cantidad de cds: " +cd
                + "\nPrecio Total: $"+tot);
        
                
    }
    
}
