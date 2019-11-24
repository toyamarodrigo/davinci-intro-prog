package arraysej03;

import javax.swing.JOptionPane;

public class Arraysej03 {

    public static void main(String[] args) {

        /*
        Realizar un programa que lea los tiempos en los que de 10 corredores 
        han acabado una carrera. El programa debe determinar qué corredores 
        tienen el primer, segundo y último puesto, así como cuál es el tiempo 
        medio en que se ha corrido la carrera.
         */
        
        // CORREGIR ARRAY OUT OF INDEX
        
        int i, tot = 0, may = Integer.MIN_VALUE, min =Integer.MAX_VALUE;
        int[] tiempo = new int[10];

        for (i = 0; i <= 9; i++) {
            tiempo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo" + i));
            tot = tot + tiempo[i];
        }

        for (i = 0; i <= tiempo.length; i++) {
            if (tiempo[i] > tiempo[i + 1]) {
                if (tiempo[i] > may) {
                    may = tiempo[i];
                }
            }
            if (tiempo[i] < tiempo[i + 1]) {
                if (tiempo[i] < min) {
                    min = tiempo[i];
                }
            }
        }
        
        System.out.println("Mayor: "+may);
        System.out.println("Menor: "+min);
        System.out.println("Total: "+tot);
        
    }

}
