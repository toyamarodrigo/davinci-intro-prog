package conej05;

import javax.swing.JOptionPane;

public class Conej05 {

    public static void main(String[] args) {
        
        String pregunta1 = "Cual es la raiz cuadrada de 144?";
        String pregunta2 = "Quien fundo BsAs?";
        String pregunta3 = "Cual es la capital de Francia?";
        
        int res1;
        String res2, res3;
        int cont = 0;
        
        res1 = Integer.parseInt(JOptionPane.showInputDialog(pregunta1));
        res2 = JOptionPane.showInputDialog(pregunta2);
        res3 = JOptionPane.showInputDialog(pregunta3);
        
        if(res1 == 12){ cont += 1; }
        if("Don Pedro de Mendoza".equalsIgnoreCase(res2)){ cont += 1; }
        if("Paris".equalsIgnoreCase(res3)){ cont += 1; }
        
        JOptionPane.showMessageDialog(null, "Acertaste: " +cont);
        
    }
    
}
