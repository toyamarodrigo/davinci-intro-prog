package conaniej00;

import java.util.Random;
import javax.swing.JOptionPane;

public class Conaniej00 {

    public static void main(String[] args) {

        int idioma;
        
        Random random = new Random();
        
        idioma = random.nextInt(3);
        
        if (idioma == 0) {
            JOptionPane.showMessageDialog(null, "Hola");
        } else if (idioma == 1) {
            JOptionPane.showMessageDialog(null, "Hello");
        } else {
            JOptionPane.showMessageDialog(null, "Bonjour");
        }
        
    }
    
}
