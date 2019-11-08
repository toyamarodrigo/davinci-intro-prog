package mientrasej00;

import java.util.Random;
import javax.swing.JOptionPane;

public class Mientrasej00 {

    public static void main(String[] args) {

        Random random = new Random();
        int c, tot = 0;
        
        c = random.nextInt(12) + 1;
        
        System.out.println("Carta: " + c);
        
        while (c != 1) {            
            tot = tot + c;
            c = random.nextInt(12) + 1;
            System.out.println("Carta: " + c);
        }
        JOptionPane.showMessageDialog(null, "Total: " + tot);
    }
    
}
