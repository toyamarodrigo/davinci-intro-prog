package extraparcialej05b;

import javax.swing.JOptionPane;

public class Extraparcialej05b {

    public static void main(String[] args) {

        /* Determinar el signo del horoscopo chino deacuerdo al aÃ±o de nacimiento */
        
    	int year,res;
    	
    	
    	year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento: "));
    	res = year % 12;
    	
    	if (year >= 0 && year <= 2020) {
    		if (res == 0) {
    			JOptionPane.showMessageDialog(null, "Mono");
    		} else if (res == 1) {
    			JOptionPane.showMessageDialog(null, "Gallo");
    		} else if (res == 2) {
    			JOptionPane.showMessageDialog(null, "Perro");
    		} else if (res == 3) {
    			JOptionPane.showMessageDialog(null, "Chancho");
    		} else if (res == 4) {
    			JOptionPane.showMessageDialog(null, "Rata");
    		} else if (res == 5) {
    			JOptionPane.showMessageDialog(null, "Buey");
    		} else if (res == 6) {
    			JOptionPane.showMessageDialog(null, "Tigre");
    		} else if (res == 7) {
    			JOptionPane.showMessageDialog(null, "Conejo");
    		} else if (res == 8) {
    			JOptionPane.showMessageDialog(null, "Dragon");
    		} else if (res == 9) {
    			JOptionPane.showMessageDialog(null, "Serpiente");
    		} else if (res == 10) {
    			JOptionPane.showMessageDialog(null, "Caballo");
    		} else if (res == 11) {
    			JOptionPane.showMessageDialog(null, "Oveja");
    		}
    	} else {
    		JOptionPane.showMessageDialog(null, "Error año de nacimiento");
    	}
    }
    
}
