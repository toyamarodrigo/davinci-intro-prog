package conanidlogej05;

import javax.swing.JOptionPane;

public class Conanidlogej05 {

    public static void main(String[] args) {

        /*
        Considerar el ejercicio anterior, pero solo se podrá resolver si se 
        cumple que los lados forman un triangulo. Debe cumplir: la suma de los 
        lados menores es mayor que la del lado mayor (considerar todos 
        los casos)
         */
        double lado1, lado2, lado3;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado1: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado2: "));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado3: "));

        if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            JOptionPane.showMessageDialog(null, "Es triangulo");
            if (lado1 == lado2 && lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Triangulo equilatero");
            } else if (lado1 == lado2 || lado2 == lado3) {
                JOptionPane.showMessageDialog(null, "Triangulo Isosceles");
            } else {
                JOptionPane.showMessageDialog(null, "Triangulo escaleno");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No es triangulo");
        }

    }

}
