package conej00;

import javax.swing.JOptionPane;

public class Conej00 {

    /*
    Juego con moneda
    m = moneda
    0 = cara : la profesora trae caramelos
    1 = ceca : tiene parcialito
    
    if ( m == 0 ) {
        JOptionPane.showMessageDialog("La profesora trae caramelos")
    } else {
        JOptionPane.showMessageDialog("Tienen parcialitos")
    }
    */
    
    /*
    if ( EXPRESION LOGICA ) {
        ACCION A;
    } else {
        ACCTION B;
    }
    */
    
    public static void main(String[] args) {
        int m;
        
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor moneda 0-cara || 1-ceca (solo numero)"));
        
        if (m == 0){
            JOptionPane.showMessageDialog(null, "La profesora trae caramelos");
        } else {
            JOptionPane.showMessageDialog(null, "Tienen parcialito");
        }
        
    }
    
}
