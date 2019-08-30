/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej07;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado1, perimetro, area;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado de cuadrado: "));
        perimetro = lado1*4;
        area = lado1 * lado1;
        
        JOptionPane.showMessageDialog(null, "Perimetro de cuadrado: " +perimetro
                + "\nArea de cuadrado: " +area);
    }
    
}
