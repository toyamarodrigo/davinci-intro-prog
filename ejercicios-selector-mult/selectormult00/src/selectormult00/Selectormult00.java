package selectormult00;

import java.util.Random;
import javax.swing.JOptionPane;

public class Selectormult00 {

    public static void main(String[] args) {
        int d;
        // String msj;
        Random random = new Random();

        d = random.nextInt(6) + 1;

        switch (d) {
            case 1:
            case 3:
            case 5:
                // msj = "Tienen Parcialito";
                JOptionPane.showMessageDialog(null, "Tienen Parcialito");
                break;
            case 2:
                // msj = "Carlos trae caramelos";
                JOptionPane.showMessageDialog(null, "Carlos trae caramelos");
                break;
            case 4:
                // msj = "Las chicas traen torta";
                JOptionPane.showMessageDialog(null, "Las chicas traen torta");
                break;
            case 6:
                // msj = "Joel trae papas fritas";
                JOptionPane.showMessageDialog(null, "Joel trae papas fritas");
                break;
        }

        // JOptionPane.showMessageDialog(null, "perdio: "+msj);
    }

}
