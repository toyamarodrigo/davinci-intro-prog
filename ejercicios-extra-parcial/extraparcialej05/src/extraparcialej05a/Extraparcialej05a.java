package extraparcialej05a;

import javax.swing.JOptionPane;

public class Extraparcialej05a {

    public static void main(String[] args) {

        /*
        Dado el numero de signo del zoodiaco, determinar la categoria a la 
        que pertenece
        
        1. Aries = Fuego
        2. Tauro = Tierra
        3. Geminis = Aire
        4. Cancer = Agua
        5. Leo = Fuego
        6. Virgo = Tierra
        7. Libra = Aire
        8. Escorpio = Agua
        9. Sagitario = Fuego
        10. Capricornio = Tierra
        11. Acuario = Aire
        12. Piscis = Agua
        */
        
        int signum;
        String fuego,tierra,aire,agua;
        
        fuego = "Fuego";
        tierra = "Tierra";
        aire = "Aire";
        agua = "Agua";
        
        signum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de signo: "
                + "\n1) Aries"
                + "\n2) Tauro"
                + "\n3) Geminis"
                + "\n4) Cancer"
                + "\n5) Leo"
                + "\n6) Virgo"
                + "\n7) Libra"
                + "\n8) Escorpio"
                + "\n9) Sagitario"
                + "\n10) Capricornio"
                + "\n11) Acuario"
                + "\n12) Piscis"));
        
        if(signum == 1 || signum == 5 || signum == 9) {
            JOptionPane.showConfirmDialog(null, fuego);
        } else if (signum == 2 || signum == 6 || signum == 10) {
            JOptionPane.showConfirmDialog(null, tierra);
        } else if (signum == 3 || signum == 7 || signum == 11) {
            JOptionPane.showConfirmDialog(null, aire);
        } else if (signum == 4 || signum == 8 || signum == 12) {
            JOptionPane.showConfirmDialog(null, agua);
        } else {
            JOptionPane.showConfirmDialog(null, "Error, numero invalido");
        }
    }
    
}
