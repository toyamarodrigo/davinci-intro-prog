package arraysej01;

import java.util.Random;
import javax.swing.JOptionPane;

public class Arraysej01 {

    public static void main(String[] args) {

        /*
        Desarrollar un programa que genere al azar 8 elementos, e informe:
        El valor acumulado de todos los elementos del vector.
        Cantidad de  elementos del vector que sean iguales a 36.
        Cantidad de valores mayores a 50.
        */
        
        Random random = new Random();
        int i, c36 = 0 , c50 = 0, tot = 0;
        int[] arr = new int[8];
        
        for (i=0 ; i<=arr.length-1 ; i++) {
            arr[i] = random.nextInt(101);
            System.out.println("Numero: "+arr[i]);
        }
        
        for (i=0 ; i<arr.length-1 ; i++) {
            tot = tot + arr[i];
            
            if (arr[i] > 50) {
                c50++;
            } else if (arr[i] == 36) {
                c36++;
            }
        }
        JOptionPane.showMessageDialog(null, "Suma: "+tot
                +"\n=36: "+c36 
                +"\n>50: "+c50);
    }
    
}
