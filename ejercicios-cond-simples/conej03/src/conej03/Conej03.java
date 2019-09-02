package conej03;

import javax.swing.JOptionPane;

public class Conej03 {

    public static void main(String[] args) {
        
        double m3;
        final double m3150 = 15.80;
        double abona;
        
        m3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese m3 consumidos: "));
        
        if(m3 <= 150){
            JOptionPane.showMessageDialog(null, "Abona: "+m3150);
        } else {
            abona = (m3 * 1.50);
            JOptionPane.showMessageDialog(null, "Abona: "+abona);
        }  
    }
    
}
