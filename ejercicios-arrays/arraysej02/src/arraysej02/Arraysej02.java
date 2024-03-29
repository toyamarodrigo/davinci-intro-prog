package arraysej02;

import java.util.Random;
import javax.swing.JOptionPane;

public class Arraysej02 {

    public static void main(String[] args) {

        /*
        Se tienen las notas del primer parcial de los alumnos de dos cursos, 
        el curso A y el curso B, se guardan en un array por cada curso, cada 
        curso cuenta con 5 alumnos.
        Realizar un programa que muestre el curso que obtuvo el mayor promedio 
        general.
        */

        int i;
        double tot1=0, tot2=0;
        
        int[] curso1 = new int[5];
        int[] curso2 = new int[5];
        
        Random random = new Random();
        for(i=0 ; i <= 4 ; i++) {
            curso1[i] = random.nextInt(10)+1;
            curso2[i] = random.nextInt(10)+1;
            System.out.println(curso1[i]);
            System.out.println(curso2[i]);
            
            tot1 = tot1 + curso1[i];
            tot2 = tot2 + curso2[i];
        }
        
        tot1 = tot1 / 5;
        tot2 = tot2 / 5;
        System.out.println(tot1);
        System.out.println(tot2);
        
        if(tot1 > tot2){
            JOptionPane.showMessageDialog(null, "Mejor promedio curso1: "+tot1);
        } else {
            JOptionPane.showMessageDialog(null, "Mejor promedio curso2: "+tot2);
        }
        
    }
    
}
