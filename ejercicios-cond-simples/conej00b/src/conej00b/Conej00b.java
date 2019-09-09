package conej00b;

import java.util.Random;
import javax.swing.JOptionPane;

public class Conej00b {

    public static void main(String[] args) {
        
        int m;
        Random random = new Random();
        m = random.nextInt(2);
        
        if(m == 1){
            JOptionPane.showMessageDialog(null, "La profesora trae caramelos");
        } else{
            JOptionPane.showMessageDialog(null, "Tienen parcialito");
        }
    }

}
