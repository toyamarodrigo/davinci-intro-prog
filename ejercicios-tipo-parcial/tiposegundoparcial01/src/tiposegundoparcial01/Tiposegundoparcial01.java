package tiposegundoparcial01;

import java.util.Random;
import javax.swing.JOptionPane;

public class Tiposegundoparcial01 {

    public static void main(String[] args) {

        /*
        Realizar un juego para adivinar un número.  Para ello la computadora 
        genera un  número N al azar, y luego ir pidiendo  al usuario números 
        indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
        El proceso termina  cuando el usuario acierta o supera la cantidad de 
        5 posibilidades.
         */
        int n, input, i;

        int[] arr = new int[4];
        Random random = new Random();
        n = random.nextInt(20) + 1;

        for (i = 0; i <= arr.length; i++) {
            input = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero Adivinar: "));
            if (input == n) {
                JOptionPane.showMessageDialog(null, "Correcto!");
                i = arr.length+1;
            } else {
                if (input < n) {
                    JOptionPane.showMessageDialog(null, "mayor");
                } else {
                    JOptionPane.showMessageDialog(null, "menor");
                }
            }
        }
        
        if(i > arr.length) {
            JOptionPane.showMessageDialog(null, "Perdiste");
        }
        
    }
}
