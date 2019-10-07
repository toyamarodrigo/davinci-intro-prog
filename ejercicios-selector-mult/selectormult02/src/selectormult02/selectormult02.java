package selectormult02;

import javax.swing.JOptionPane;

public class Selectormult02 {

	public static void main(String[] args) {

		/*
		 * El costo de las llamadas internacionales depende de la zona geografica del
		 * pais destino y de la cantidad de minutos hablados. En la siguiente tabla se
		 * representa el costo del minuto por zona, cada zona tiene un numero clave
		 * conocido por el operador y si el costo supera los $15, se realiza un 15% de
		 * descuento, solo se ingresa la clave y los minutos. El programa debe indicar
		 * la zona y el total a pagar.
		 * 
		 * Clave 		Zona 					Precio 
		 * 12 			America del norte 		0.68 
		 * 15 			America Central 		0.55 
		 * 18 			AMerica sur 			0.62 
		 * 19 			Europa 					0.85 
		 * 23 			Asia 					0.89 
		 * 25 			Africa 					0.82
		 */

		double tot=0, minutos;
		int clave;
		clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Clave"));
		minutos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Minutos"));

		switch (clave) {
		case 12:
			tot = minutos * 0.68;
			break;
		case 15:
			tot = minutos * 0.55;
			break;
		case 18:
			tot = minutos * 0.62;
			break;
		case 19:
			tot = minutos * 0.85;
			break;
		case 23:
			tot = minutos * 0.89;
			break;
		case 25:
			tot = minutos * 0.82;
			break;
		}
		
		if (tot > 15) {
			tot -= tot * 0.15;
			JOptionPane.showMessageDialog(null, "Se aplica descuento 15%, Total: "+tot);
		} else {
			JOptionPane.showMessageDialog(null, "Total: "+tot);
		}
	}

}
