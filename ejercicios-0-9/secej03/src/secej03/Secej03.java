/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secej03;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Secej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio, cant, abonar;
        
        precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del articulo: "));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad que lleva el cliente: "));
        
        abonar = (int) (precio * cant);
        
        JOptionPane.showMessageDialog(null, "El comprador debe abonar: " +abonar);
        
    }
    
}
