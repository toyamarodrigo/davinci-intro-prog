package conej04;

import javax.swing.JOptionPane;

public class Conej04 {

    public static void main(String[] args) {
        
        String tipoventa;
        double totventa;
        
        totventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese total de la venta: "));
        tipoventa = JOptionPane.showInputDialog("Contado(C), Tarjeta(T)? ");
        
        if( "c".equals(tipoventa) || "C".equals(tipoventa) ){
            totventa = totventa - (totventa*10/100);
            JOptionPane.showMessageDialog(null, "Se aplica descuento 10%, total: "+totventa);
        } else {
            JOptionPane.showMessageDialog(null, "total: "+totventa);
        }
        
        
    }
    
}
