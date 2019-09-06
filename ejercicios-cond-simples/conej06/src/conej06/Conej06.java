package conej06;

import javax.swing.JOptionPane;

public class Conej06 {

    public static void main(String[] args) {
        double num,den,result;
        
        num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de numerador: "));
        den = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de denominador: "));
        result = num / den;
        
        if ( den == 0 ) {
            JOptionPane.showMessageDialog(null, "Imposible dividir por cero");
        } else {
            JOptionPane.showMessageDialog(null, "Resultado: "+result);
        }
    }
    
}