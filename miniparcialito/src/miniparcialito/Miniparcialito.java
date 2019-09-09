package miniparcialito;

import javax.swing.JOptionPane;

public class Miniparcialito {

    public static void main(String[] args) {

        /* 
        1_
        Si Fase contiene el numero 4 que imprime el siguiente fragmento:
        */

        int fase = 4;
        
        if(fase <= 4) {
            fase = fase + 2 * fase;
        } else {
            fase = fase + 2 * fase;
            JOptionPane.showMessageDialog(null, "-"+fase+"es el numero");
        }
        
        // a) -12
        // b) -4 es el numero
        // c) -12 es el numero
        // d) -24 es el numero
        // e) ninguno de los anteriores
                
        /*
        2_
        Indicar en que variable se puede guardar el dato.
        */
        double m, n;
        int p, t=1;
        String a;
        final int z = 180;
        final double r = 0.5;
        
        // a = "m * n - p";
        // m o n = z/t;
        // n o t = r * 10;
        
        /*
        3_
        En una editorial el precio del libro es de 550 mas 3.52 por pagina.
        Si tiene mas de 500 paginas, se agrega encuadernacion de tela, lo que 
        incrementa el valor en 330, en este caso tiene un 2% de desctuento sobre 
        el total
        */
        
        int cantpag;
        double tot;
        
        cantpag = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de pagines: "));
        tot = cantpag * 3.52;
        
        if (cantpag > 500) {
            tot += 330;
            tot = tot - (tot * 0.02);
        }
        
        JOptionPane.showMessageDialog(null, "Total: "+tot);
        
    }
    
}
