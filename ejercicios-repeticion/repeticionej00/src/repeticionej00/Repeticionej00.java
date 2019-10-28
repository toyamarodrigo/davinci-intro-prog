package repeticionej00;

import java.util.Random;
import javax.swing.JOptionPane;

public class Repeticionej00 {

    public static void main(String[] args) {

        Random random = new Random();
        int c, tot = 0;
        
        for (int i = 0; i <= 4; i++) {
            c = random.nextInt(12)+1;
            tot = tot + c;
            System.out.println("carta: " + c);
        }
        
        JOptionPane.showMessageDialog(null, "total: " + tot);
    }
    
}
