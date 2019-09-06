package conanidlogej01;

import javax.swing.JOptionPane;

public class Conanidlogej01 {

    public static void main(String[] args) {

        /*
        Dados los datos de categoría y sueldo de un trabajador, calcular 
        el aumento correspondiente teniendo en cuenta la siguiente tabla
            A y C = 15%
            B y D = 10%
            E = 5%
        */
        
        double sueldo;
        String cat;
        
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo de trabajor: "));
        cat = JOptionPane.showInputDialog("Ingrese categoria (A B C D o E)");
        
        if (cat.equalsIgnoreCase("a") || cat.equalsIgnoreCase("c")){
            sueldo += sueldo*0.15;
            JOptionPane.showMessageDialog(null, "Aumento de 15%: "+sueldo);
        } else if (cat.equalsIgnoreCase("b") || cat.equalsIgnoreCase("d")) {
            sueldo += sueldo*0.10;
            JOptionPane.showMessageDialog(null, "Aumento de 10%: "+sueldo);
        } else if (cat.equalsIgnoreCase("e")){
            sueldo += sueldo*0.05;
            JOptionPane.showMessageDialog(null, "Aumento de 5%: "+sueldo);
        } else {
            JOptionPane.showMessageDialog(null, "Sin aumento de sueldo: "+sueldo);
        }
            
    }
    
}
