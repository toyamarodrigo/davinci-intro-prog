package tipoprimerparcialej02;

import javax.swing.JOptionPane;

public class Tipoprimerparcialej02 {

    public static void main(String[] args) {

        /*Determinar que realiza el siguiente programa y escribir un enunciado para él:*/
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
        if (num == 0) {
            JOptionPane.showMessageDialog(null, " es 0");
        } else if (num > 0) {
            JOptionPane.showMessageDialog(null, " es +");
        } else {
            JOptionPane.showMessageDialog(null, " es -");
        }

        /*
        Ingrese un numero. 
        Si es igual a 0 diga "es 0".
        Si es mayor a 0, que diga "es +"
        y si es menor a 0, que diga "es -"
        */
        
        
    }

}
