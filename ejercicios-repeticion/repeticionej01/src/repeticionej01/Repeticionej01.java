package repeticionej01;

import java.util.Random;
import javax.swing.JOptionPane;

public class Repeticionej01 {

    public static void main(String[] args) {
        
        /*
        Dados como datos los sueldos de 10 trabajadores, obtener el total de 
        sueldos pagados en el mes
        */
        
        Random random = new Random();
        
        int sueldo, tot = 0;
        
        for (int i = 1; i <= 10; i++) {
            sueldo = random.nextInt(60000);
            tot += sueldo;
            System.out.println("sueldo"+ i + ": " + sueldo);
        }
        
        JOptionPane.showMessageDialog(null, "Total: " + tot);

    }
    
}
