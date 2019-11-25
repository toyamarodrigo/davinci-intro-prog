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
        int i, gana = 0, pierde = 0, segundo = 0;
        double tot = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        double[] tiempo = new double[10];
        Random random = new Random();

        /*
        for (i = 0; i <= tiempo.length - 1; i++) {
            tiempo[i] = random.nextDouble() * 20;
            // Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo" + i));
            tot = tot + tiempo[i];
        }
        
        for (i = 0; i <= tiempo.length - 1; i++) {
            for (int j = i + 1; j <= tiempo.length - 1; j++) {
                if (tiempo[j] > max) {
                    max = tiempo[j];
                    pierde = i + 1;
                }
                if (tiempo[j] < min) {
                    min = tiempo[j];
                    gana = i + 1;
                }
                if (tiempo[j] < seg && tiempo[j] != min) {
                    seg = tiempo[j];
                    seg = i + 1;
                }
            }
        }
        */
        
        for (i=0 ; i<tiempo.length-1 ; i++){
            tiempo[i] = random.nextDouble()*20;
        }
        
        for (i=0 ; i <tiempo.length-1 ; i++) {
            if (tiempo[i] < min) {
                min = tiempo[i];
                gana = i+1;
            }
            if (tiempo[i] > max) {
                max = tiempo[i];
                pierde = i+1;
            }
        }
        
        double seg = 9999;
        
        for (i=0 ; i<tiempo.length-1 ; i++) {
            if (tiempo[i] < seg && tiempo[i] != min){
                seg = tiempo[i];
                segundo = i+1;
            }
        }
        
        
        System.out.println("Primerp: " + min);
        System.out.println("Segundo: " + seg);
        System.out.println("Ultimo: " + max);
        System.out.println("Total: " + tot);

    }

}
