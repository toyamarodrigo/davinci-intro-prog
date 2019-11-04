package repeticionej04;

import java.util.Random;
import javax.swing.JOptionPane;

public class Repeticionej04 {

    public static void main(String[] args) {

        /*
        Dados n números enteros, calcular el menor de ellos
        */
        
        int n1, num, menor = Integer.MAX_VALUE;
        
        Random random = new Random();
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        for (int i = 1; i <= n1; i++) {
            num = random.nextInt(11);
            
            if(num < menor){
                menor = num;
            }
            
            System.out.println("num"+i+": "+num);
        }
        
        JOptionPane.showMessageDialog(null, "El menor es: " + menor);
        
    }
    
}
