package conanidlogej02;

import javax.swing.JOptionPane;

public class Conanidlogej02 {

    public static void main(String[] args) {

        /*
        Dados 3 números determinar cual es el mayor
         */
    	
        int A, B, C;

        A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor C: "));

        if ( A >= B && A >= C ){
            JOptionPane.showMessageDialog(null, "A es el mayor: "+A);
        } else if ( B >= A && B >= C ) {
            JOptionPane.showMessageDialog(null, "B es el mayor: "+B);
        } else {
            JOptionPane.showMessageDialog(null, "C es el mayor: "+C);
        }

    }

}
