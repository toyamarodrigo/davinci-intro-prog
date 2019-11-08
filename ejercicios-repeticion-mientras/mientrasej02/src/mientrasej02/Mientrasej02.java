package mientrasej02;

import javax.swing.JOptionPane;

public class Mientrasej02 {

    public static void main(String[] args) {

        /*
        Dados pares de números se pide calcular el promedio de ellos, el 
        programa termina cuando el usuario responde “no” a la pregunta 
        ¿desea calcular otro par?
        */
        
        String preg;
        int num1, num2, tot;
        
        do {      
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2: "));
            
            tot = num1 + num2 / 2;
            JOptionPane.showMessageDialog(null, "Promedio: " + tot);
            
            preg = JOptionPane.showInputDialog("¿desea calcular otro par?");
            
        } while (!preg.equalsIgnoreCase("no"));


    }
    
}
