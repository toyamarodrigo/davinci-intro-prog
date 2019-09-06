package conej05;

import javax.swing.JOptionPane;

public class Conej05 {

    public static void main(String[] args) {
        
        final String preg1 = "Cual es la raiz cuadrada de 144?";
        final String preg2 = "Quien fundo BsAs?";
        final String preg3 = "Cual es la capital de Francia?";
        
        int res1;
        String res2, res3;
        int cont = 0;
        
        res1 = Integer.parseInt(JOptionPane.showInputDialog(preg1));
        res2 = JOptionPane.showInputDialog(preg2);
        res3 = JOptionPane.showInputDialog(preg3);
        
        if(res1 == 12){
            cont += 1; 
            JOptionPane.showMessageDialog(null, "Correcto!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto!");
        }
        
        if("Don Pedro de Mendoza".equalsIgnoreCase(res2)){
            cont += 1;
            JOptionPane.showMessageDialog(null, "Correcto!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto!");
        }
        
        if("Paris".equalsIgnoreCase(res3)){
            cont += 1;
            JOptionPane.showMessageDialog(null, "Correcto!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto!");
        }
        
        JOptionPane.showMessageDialog(null, "Acertaste: " +cont);
        
    }
    
}