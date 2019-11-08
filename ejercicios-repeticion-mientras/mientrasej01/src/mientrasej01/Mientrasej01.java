package mientrasej01;

import java.util.Random;
import javax.swing.JOptionPane;

public class Mientrasej01 {

    public static void main(String[] args) {

        /*
        Se tiene la nota de un grupo de estudiantes. Se pide determinar 
        cuantos aprobaron (nota> 4), de estos cuantos deben presentar 
        tp (nota >= 7) y cuantos rinden escrito (nota <7) y cuantos desaprobaron 
        Para finalizar se ingresar una nota negativa
         */
        int notas, estudiantes, c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        Random random = new Random();

        notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota: "));

        while (notas >= 0) {
            System.out.println(notas);
            if (notas > 4) {
                c1++;
                if (notas >= 7) {
                    c2++;
                } else if (notas < 7) {
                    c3++;
                }
            } else {
                c4++;
            }
            notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota: "));
        }

        JOptionPane.showMessageDialog(null, "Aprobaron: " + c1
                + "\nPresentan TP: " + c2
                + "\nRinden Escrito: " + c3
                + "\nDesaprobaron: " + c4);

    }

}
