package repeticionej05;

import java.util.Random;
import javax.swing.JOptionPane;

public class Repeticionej05 {

    public static void main(String[] args) {

        /*
        Dado el sueldo de n personas, se pide obtener:
            - la cantidad de desocupados, la cantidad que cobran hasta 500$, 
            la cantidad que cobran entre 500 y 1000, la cantidad entre 1000 y 2000, 
            y los que superan los 2000
            - el sueldo máximo y el nombre de la persona de sueldo máximo
            - total de sueldos pagados
         */
        double personas, sueldo, max = Double.MIN_NORMAL;
        int tot1 = 0, tot2 = 0, tot3 = 0, tot4 = 0, tot5 = 0, total = 0, persona = 0;
        Random random = new Random();

        personas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de personas: "));

        for (int i = 1; i <= personas; i++) {

            sueldo = random.nextDouble() * 3000;
            System.out.println(sueldo);

            if (sueldo == 0) {
                tot1++;
            } else if (sueldo <= 500) {
                tot2++;
            } else if (sueldo > 500 && sueldo <= 1000) {
                tot3++;
            } else if (sueldo > 1000 && sueldo <= 2000) {
                tot4++;
            } else {
                tot5++;
            }

            if (sueldo > max) {
                max = sueldo;
                persona = i;
            }
            
            total += sueldo;
            
        }

        JOptionPane.showMessageDialog(null, "Personas desocupadas: " + tot1
                + "\nPersonas con sueldo entre 1 y 500: " + tot2
                + "\nPersonas con sueldo entre 501 y 1000: " + tot3
                + "\nPersonas con sueldo entre 1001 y 2000: " + tot4
                + "\nPersonas con sueldo mayor a 2001: " + tot5);

        JOptionPane.showMessageDialog(null, "Persona num" + persona
                + "\nSueldo: " + max);

        JOptionPane.showMessageDialog(null, "Total de sueldos: " + total);

    }

}
