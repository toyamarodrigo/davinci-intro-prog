package conanidlog04;

import javax.swing.JOptionPane;

public class Conanidlog04 {

    public static void main(String[] args) {

        /*
        Dados los lados de un triangulo determinar si es equilátero, 
        isósceles o escaleno
         */
        double lado1, lado2, lado3;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado1: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado2: "));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado3: "));

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Triangulo equilatero");
        } else if (lado1 == lado2 || lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Triangulo Isosceles");
        } else {
            JOptionPane.showMessageDialog(null, "Triangulo escaleno");
        }

    }

}
