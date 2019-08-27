/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej01;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,d,s,prod;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n1: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n2: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n3: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n4: "));
        
        s = a+b;
        prod = c*d;
        
        JOptionPane.showMessageDialog(null, "La suma es: " +s+ ", y la multiplicacion es: " +prod);
    }
    
}
