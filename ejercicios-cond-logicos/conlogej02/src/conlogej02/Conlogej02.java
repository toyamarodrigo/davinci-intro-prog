package conlogej02;

import javax.swing.JOptionPane;

/** @author Rodrigo Toyama <toyama.rodrigo@gmail.com> */
public class Conlogej02 {

    public static void main(String[] args) {
        /*
        En la entrada del cine se debe indicar si es “menor”, “activo” o 
        “jubilado”. Si la categoría es menor o jubilado se le realiza un 25% de 
        descuento.
        */
        double entrada;
        String res;
        
        entrada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de entrada: "));
        res = JOptionPane.showInputDialog("Ingrese categoria (menor, activo o jubilado): ");
        
        
        if(!res.equalsIgnoreCase("activo")){
            entrada = entrada - (entrada * 0.25);
            JOptionPane.showMessageDialog(null, "Entrada + desc 25%: $"+entrada);
        } else {
            JOptionPane.showMessageDialog(null, "Entrada: $"+entrada);
        }
        
    }
    
}
