package arraysej03;

import java.util.Random;
import javax.swing.JOptionPane;

public class Arraysej03 {

    public static void main(String[] args) {

        /*
        Realizar un programa que lea los tiempos en los que de 10 corredores 
        han acabado una carrera. El programa debe determinar qué corredores 
        tienen el primer, segundo y último puesto, así como cuál es el tiempo 
        medio en que se ha corrido la carrera.
         */
        
        int i, tot = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] tiempo = new int[10];
        Random random = new Random();

        for (i=0 ; i<=tiempo.length-1 ; i++) {
            tiempo[i] = random.nextInt(10) + 1;
            // Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo" + i));
            tot = tot + tiempo[i];
        }

        for (i = 0; i<=tiempo.length-1 ; i++) {
            for (int j=i+1 ; j<=tiempo.length-1 ; j++) {
                if (tiempo[j] > max) {
                    max = tiempo[j];
                }
                if (tiempo[j] < min) {
                    min = tiempo[j];
                }
            }
        }

        System.out.println("Mayor: " + max);
        System.out.println("Menor: " + min);
        System.out.println("Total: " + tot);

    }

}
