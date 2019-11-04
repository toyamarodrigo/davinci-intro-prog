package repeticionej03;

import java.util.Random;
import javax.swing.JOptionPane;

public class Repeticionej03 {

    public static void main(String[] args) {

        /*
        Generar 100 números al azar y verificar la cantidad que salieron 
        entre 0 y 25, la cantidad entre 25 y 50, la cantidad entre 50 y 75 y 
        la cantidad entre 75 y 100
         */
        Random random = new Random();

        int tot1 = 0, tot2 = 0, tot3 = 0, tot4 = 0, num;

        for (int i = 1; i <= 100; i++) {

            num = random.nextInt(101);

            if (num <= 25) {
                tot1++;
            } else if (num <= 50) {
                tot2++;
            } else if (num <= 75) {
                tot3++;
            } else {
                tot4++;
            }
            System.out.println("num" + i + ": " + num);
        }

        JOptionPane.showMessageDialog(null,
                "Numeros entre 0 y 25: "+tot1+
                        "\nNumeros entre 26 y 50: "+tot2+
                        "\nNumeros entre 51 y 75: "+tot3+
                        "\nNumeros entre 76 y 100: "+tot4);
        
        
    }

}
