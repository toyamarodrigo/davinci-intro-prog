/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej02;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,d,suma,prom;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n2: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n3: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n4: "));
        
        suma = a+b+c+d;
        
        prom = suma / 4;
        
        JOptionPane.showMessageDialog(null, "La suma es de los cuatro valores es: " +suma
                + "\ny el promedio es: " +prom);
    }
    
}
