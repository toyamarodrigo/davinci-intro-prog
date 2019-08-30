package conej01;

import javax.swing.JOptionPane;

public class Conej01 {

    public static void main(String[] args) {

        double nota;

        nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota: "));

        if (nota >= 4) {
            JOptionPane.showMessageDialog(null, "aprobado");
        } else {
            JOptionPane.showMessageDialog(null, "no aprobado");
        }

    }

}
