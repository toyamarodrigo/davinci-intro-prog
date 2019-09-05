package conlogej01;

import javax.swing.JOptionPane;

/** @author Rodrigo Toyama <toyama.rodrigo@gmail.com> */
public class Conlogej01 {

    public static void main(String[] args) {
        /*
        Hacer un programa para calcular el precio de un ticket de ida y vuelta 
        en ferrocarril, conociendo la distancia de ida y el tiempo de estancia. 
        Se sabe además que si el número de días de estancia es superior a 7 y 
        la distancia total a recorrer es superior a 800 km, el billete tiene 
        un  descuento del 30%. El precio por km es de $3.70. Indica cuanto debe 
        abonar.
        */
        
        int tiempo, ida, tot_dist;
        double ticket;
        final double preciokm = 3.70;
        
        ida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese distancia de ida: "));
        tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo de estancia: "));
        
        tot_dist =  ida * 2;
        ticket = tot_dist * preciokm;
        
        if( tiempo > 7 && tot_dist >= 800 ) {
            ticket = ticket - (ticket*30)/100;
            JOptionPane.showMessageDialog(null, "Precio de ticket + desc 30%: "+ticket);
        } else {
            JOptionPane.showMessageDialog(null, "Precio de ticket: "+ticket);
        }
        
        
        
        
        
    }
    
}
