package tiposegundoparcialej03;

import javax.swing.JOptionPane;

public class Tiposegundoparcialej03 {

    public static void main(String[] args) {

        /*
        Una emisora de radio quiere hacer un concurso en el que proponen a sus 
        Oyentes los títulos de 10 canciones, a las que ha numerado del 0 al 9. 
        Cada participante debe llamar para dar los números de 3 títulos por 
        orden de preferencia decreciente. 
        Se le dan 3 puntos a la canción que el oyente nombra en 1er lugar, 
        2 puntos a la que indica en 2º lugar y 1 punto a la 3ª. 
        Se pide hacer un programa que realice las siguientes tareas: 
        Leer y almacenar los votos emitidos por cada oyente, suponemos que 
        como máximo pueden concursar 20 oyentes. 
        La entrada de datos se realizará en forma de tríos, con los números de 
        las canciones que vota cada oyente. 
        
        Se pide determinar:
        a. El tema  mas  votado
        b. Tema   menos votado
        c. cantidad de temas que superan los 20 puntos.
        */
        
        // TODO: Arreglar
        
        int c1, c2, c3, i, max = 0, min = 0, masvot = 0, menosvot = 0, c20 = 0;
        int[] can = new int[9];
        
        for (i=1 ; i<20 ; i++) {
            c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cancion1"));
            c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cancion2"));
            c3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cancion3"));
            can[c1] = can[c1] + 3;
            can[c2] = can[c2] + 2;
            can[c3] = can[c3] + 1;
        }
        
        for (i=0 ; i<can.length ; i++) {
            if (can[i] > max) {
                max = can[i];
                masvot = i;
            }
            
            if (can[i] < min) {
                min = can[i];
                menosvot = i;
            }
            
            if (can[i] > 20) {
                c20++;
            }
        }
        
        System.out.println("Mas votada: " + masvot 
                + "\nMenos votada: " + menosvot 
                + "\nCant > 20: " + c20);
        
    }

}