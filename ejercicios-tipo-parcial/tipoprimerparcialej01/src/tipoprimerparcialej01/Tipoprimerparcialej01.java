package tipoprimerparcialej01;

import javax.swing.JOptionPane;

public class Tipoprimerparcialej01 {

    public static void main(String[] args) {

        /*
        En nuestro club los niños entre 4 y 16 años tienen cuatro categorías 
        dentro de natación: mojarritas, mojarra, tiburones y delfines, de 
        acuerdo a la edad, a la pileta donde se realiza y nivel en el agua.
        
        Delfines: 4 a 6 años - pileta chica
        Tiburones: 7 a 11 años - pileta grande - flotacion y desplazamiento en el agua
        Mojarritas: 12 a 14 años - pileta grande - estilo crol y correcciones
        Mojarras: 15 a 16 años - pileta grande - crol y espalda nivel superior y competicion
        
        Los costos se calculan en base a estos conceptos, edad y si tiene profesor 
        individual o no, basica es de $800 a esto se le agrega:
        
        - si la pileta que se utiliza es la chica, se hace un descuento del 10%
        pero si tiene profesor indivicual se agrega $300
        - tiene menos de 12 años y tiene profesor individual se agrega $350
        - si tiene mas de 12 años y tiene profesor individual se agrega $400
        
        El programa debe indicar a que categoria pertenece y cuanto paga cada uno
         */
        String profesor;
        int edad;
        double precio = 800, tot;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
        profesor = JOptionPane.showInputDialog("Tiene profesor individual? y/n");

        if (edad >= 4 && edad <= 6 && profesor.equalsIgnoreCase("y")) {
            JOptionPane.showMessageDialog(null, "Categoria: Delfin"
                    + "\nPileta chica, con profesor. "
                    + "\nAplica 10% desc. "
                    + "\nSe agrega $300");
            precio -= precio * 0.10;
            precio += 300;
        } else if (edad >= 4 && edad <= 6 && profesor.equalsIgnoreCase("n")) {
            JOptionPane.showMessageDialog(null, "Categoria: Delfin"
                    + "\nPileta chica, sin profesor. "
                    + "\nAplica 10% desc");
            precio -= precio * 0.10;
        } else if (edad > 6 && edad <= 11 && profesor.equalsIgnoreCase("y")) {
            JOptionPane.showMessageDialog(null, "Categoria: Tiburones"
                    + "\nPileta Grande, con profesor."
                    + "\n Aplica $350");
            precio += 350;
        } else if (edad > 11 && edad <= 14 && profesor.equalsIgnoreCase("y")) {
            JOptionPane.showMessageDialog(null, "Categoria: Mojarrita"
                    + "\nPileta Grande, con profesor."
                    + "\nAplica $400");
            precio += 400;
        } else if (edad > 14 && edad <= 16 && profesor.equalsIgnoreCase("y")) {
            JOptionPane.showMessageDialog(null, "Categoria: Mojarra"
                    + "\nPileta Grande, con profesor."
                    + "\nAplica $400");
            precio += 400;
        }
        
        JOptionPane.showMessageDialog(null, "Precio: "+precio);
    }
}
