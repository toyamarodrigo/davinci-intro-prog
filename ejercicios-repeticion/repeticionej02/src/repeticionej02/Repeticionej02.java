package repeticionej02;

import java.util.Random;
import javax.swing.JOptionPane;

public class Repeticionej02 {

    public static void main(String[] args) {

        /*
        Generar al azar 20 números en el intervalo (0-100), imprimir la 
        cantidad de ceros que salieron
         */
        Random random = new Random();
        int numero, tot = 0;

        for (int i = 1; i <= 20; i++) {
            numero = random.nextInt(100);
            if (numero == 0) {
                tot++;
                System.out.println("numero" + i + ": " + tot);
            }
            System.out.println("numero" + i + ": " + numero);
        }
        JOptionPane.showMessageDialog(null, "Total: " + tot);
    }

}
