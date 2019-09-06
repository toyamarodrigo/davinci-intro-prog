package conej03;

import java.util.Random;
import javax.swing.JOptionPane;

public class Conej03 {

    public static void main(String[] args) {
        
        double m3;
        final double m3150 = 15.80;
        double abona;
        Random random = new Random();
        
        m3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese m3 consumidos: "));
        //m3 = random.nextInt(301);
        //JOptionPane.showMessageDialog(null, "m3 consumidos: "+m3);

        
        if(m3 <= 150){
            JOptionPane.showMessageDialog(null, "Abona: "+m3150);
        } else {
            abona = m3150 + ((m3-150) * 1.50);
            JOptionPane.showMessageDialog(null, "Abona: "+abona);
        }  
    }
    
}
