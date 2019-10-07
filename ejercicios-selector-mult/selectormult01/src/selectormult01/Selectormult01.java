package selectormult01;

import javax.swing.JOptionPane;

public class Selectormult01 {

    public static void main(String[] args) {

        int op;
        double n1, n2, tot;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero2: "));
        op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de operacion: \n1)Suma \n2)Resta \n3)Mult \n4)Div"));
        
        
        switch(op){
            case 1: 
                tot = n1 + n2;
                JOptionPane.showMessageDialog(null, "Resultado: "+tot);
                break;
            case 2: 
                tot = n1 - n2;
                JOptionPane.showMessageDialog(null, "Resultado: "+tot);
                break;
            case 3: 
                tot = n1 * n2;
                JOptionPane.showMessageDialog(null, "Resultado: "+tot);
                break;
            case 4: 
                if (n2 != 0) {
                    tot = n1 / n2;
                    JOptionPane.showMessageDialog(null, "Resultado: "+tot);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacion invalida");
                break;
        }
        
        
        
    }
    
}
