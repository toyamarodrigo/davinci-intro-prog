package extraparcialej05c;

import javax.swing.JOptionPane;

public class Extraparcialej05c {

	public static void main(String[] args) {

		/*
		 * Tomando como base los resultados obtenidos en un laboratorio de análisis
		 * clínicos, un medico determina si una persona tiene anemia o no, lo cual
		 * depende de su nivel de hemoglobina en la sangre, de su edad y de su sexo.
		 * 
		 * Si el nivel de hemoglobina que tiene una persona es menor que el rango que le
		 * corresponde, se determina su resultado como positivo y en caso contrario como
		 * negativo. La tabla en la que el médico se basa para obtener el resultado es
		 * la siguiente:
		 */
		
		/*
		 * Edad: 0 - 1 mes Hemo: 13.0% - 26.0% g 
		 * Edad: > 1 y <= 6 meses Hemo: 10.0% - 18.0% g 
		 * Edad: > 6 y <= 12 meses Hemo: 11.0% - 15.0% g 
		 * Edad: > 1 y <= 5 años Hemo: 11.5% - 15.0% g 
		 * Edad: > 5 y <= 10 años Hemo: 12.6% - 15.5% g 
		 * Edad: > 10 y <= 15 años Hemo: 13.0% - 15.5% g 
		 * Edad: mujeres > 15 años Hemo: 12.0% - 16.0% g 
		 * Edad: hombres > 15 años Hemo: 14.0% - 18.0% g
		 */

		int edad = 0;
		double hemo;
		String sexo, preg;
		boolean ym = false;

		preg = JOptionPane.showInputDialog("Mayor a 1(un) año? y/n");

		if (preg.equalsIgnoreCase("y")) {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de edad : "));
			ym = true;
		} else if (preg.equalsIgnoreCase("n")) {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese meses de edad: "));
			ym = false;
		} else {
			JOptionPane.showMessageDialog(null, "error edad");
		}

		sexo = JOptionPane.showInputDialog("Ingrese Sexo Masculino(M) o Femenino(F): ");
		hemo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de Hemoglobina: "));

		if (ym == true) {
			if (edad >= 1 && edad <= 5) {
				if (hemo < 11.5) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			} else if (edad > 5 && edad <= 10) {
				if (hemo < 12.6) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			} else if (edad > 10 && edad <= 15) {
				if (hemo < 13) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			} else if (sexo.equalsIgnoreCase("f") && edad > 15) {
				if (hemo < 12) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			} else if (sexo.equalsIgnoreCase("m") && edad > 15) {
				if (hemo < 14) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			}
		} else {
			if (edad == 0 || edad == 1) {
				if (hemo < 13) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			} else if (edad > 1 && edad <= 6) {
				if (hemo < 10) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			} else if (edad > 6 && edad <= 12) {
				if (hemo < 11) {
					JOptionPane.showMessageDialog(null, "Positivo anemia");
				} else {
					JOptionPane.showMessageDialog(null, "Negativo anemia");
				}
			}
		}

	}
}
