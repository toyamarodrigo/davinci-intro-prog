package mientrasej00a;

import java.util.Random;
import javax.swing.JOptionPane;

public class Mientrasej00a {

    public static void main(String[] args) {

        Random random = new Random();
        int c, tot = 0;
        
        c = random.nextInt(12) + 1;
        
        System.out.println("Carta: " + c);
        
        do {            
            tot = tot + c;
            c = random.nextInt(12) + 1;
            System.out.println("Carta: " + c);
        } while (c != 1);
        
        JOptionPane.showMessageDialog(null, "Total: " + tot);

        
    }
    
}
