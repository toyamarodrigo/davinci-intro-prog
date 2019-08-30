/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej09;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m,s,h;
        m = 1;
        s = 5;
        h = 10;
        
        h = (m * s) + h;
        s = (h + m);
        JOptionPane.showMessageDialog(null, h+"-"+s+"-"+m);
    }
    
}
