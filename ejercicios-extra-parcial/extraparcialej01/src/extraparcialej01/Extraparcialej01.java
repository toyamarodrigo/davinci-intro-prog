package extraparcialej01;

import javax.swing.JOptionPane;

public class Extraparcialej01 {

	public static void main(String[] args) {
		/*
		 * Dado el día y el mes de nacimiento, indicar a que signo zodiacal al que
		 * pertenece Acuario Del 21 de enero al 18 de febrero Piscis Del 19 de febrero
		 * al 20 de marzo Aries Del 21 de marzo al 20 de abril Tauro Del 21 de abril al
		 * 21 de mayo Géminis Del 22 de mayo al 21 de junio Cáncer Del 22 de junio al 22
		 * de julio Leo Del 23 de julio al 23 de agosto Virgo Del 24 de agosto al 23 de
		 * septiembre Libra Del 24 de septiembre al 23 de octubre Escorpión Del 24 de
		 * octubre al 22 de noviembre Sagitario Del 23 de noviembre al 21 de diciembre
		 * Capricornio Del 22 de diciembre al 20 de enero
		 */

		/*
		int dia;
		String mes;

		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de nacimiento: "));
		mes = JOptionPane.showInputDialog("Ingrese mes de nacimiento: ");

		if (mes.equalsIgnoreCase("enero") && (dia >= 21 && dia <= 31)
				|| mes.equalsIgnoreCase("febrero") && (dia >= 1 && dia <= 18)) {
			// Acuario
			JOptionPane.showMessageDialog(null, "Acuario");
		} else if (mes.equalsIgnoreCase("febrero") && (dia >= 19 && dia <= 29)
				|| mes.equalsIgnoreCase("marzo") && (dia >= 1 && dia <= 20)) {
			// Piscis
			JOptionPane.showMessageDialog(null, "Piscis");
		} else if (mes.equalsIgnoreCase("marzo") && (dia >= 21 && dia <= 31)
				|| mes.equalsIgnoreCase("abril") && (dia >= 1 && dia <= 20)) {
			// Aries
			JOptionPane.showMessageDialog(null, "Aries");
		} else if (mes.equalsIgnoreCase("abril") && (dia >= 21 && dia <= 30)
				|| mes.equalsIgnoreCase("mayo") && (dia >= 1 && dia <= 21)) {
			// Tauro
			JOptionPane.showMessageDialog(null, "Tauro");
		} else if (mes.equalsIgnoreCase("mayo") && (dia >= 22 && dia <= 31)
				|| mes.equalsIgnoreCase("junio") && (dia >= 1 && dia <= 30)) {
			// Geminis
			JOptionPane.showMessageDialog(null, "Geminis");
		} else if (mes.equalsIgnoreCase("junio") && (dia >= 22 && dia <= 31)
				|| mes.equalsIgnoreCase("julio") && (dia >= 1 && dia <= 22)) {
			// Cancer
			JOptionPane.showMessageDialog(null, "Cancer");
		} else if (mes.equalsIgnoreCase("julio") && (dia >= 23 && dia <= 31)
				|| mes.equalsIgnoreCase("agosto") && (dia >= 1 && dia <= 23)) {
			// Leo
			JOptionPane.showMessageDialog(null, "Leo");
		} else if (mes.equalsIgnoreCase("agosto") && (dia >= 24 && dia <= 31)
				|| mes.equalsIgnoreCase("septiembre") && (dia >= 1 && dia <= 23)) {
			// Virgo
			JOptionPane.showMessageDialog(null, "Virgo");
		} else if (mes.equalsIgnoreCase("septiembre") && (dia >= 24 && dia <= 30)
				|| mes.equalsIgnoreCase("octubre") && (dia >= 1 && dia <= 23)) {
			// Libra
			JOptionPane.showMessageDialog(null, "Libra");
		} else if (mes.equalsIgnoreCase("octubre") && (dia >= 24 && dia <= 31)
				|| mes.equalsIgnoreCase("noviembre") && (dia >= 1 && dia <= 22)) {
			// Escorpio
			JOptionPane.showMessageDialog(null, "Escorpio");
		} else if (mes.equalsIgnoreCase("noviembre") && (dia >= 23 && dia <= 30)
				|| mes.equalsIgnoreCase("diciembre") && (dia >= 21 && dia <= 31)) {
			// Sagitario
			JOptionPane.showMessageDialog(null, "Sagitario");
		} else if (mes.equalsIgnoreCase("diciembre") && (dia >= 22 && dia <= 31)
				|| mes.equalsIgnoreCase("enero") && (dia >= 1 && dia <= 20)) {
			// Capricornio
			JOptionPane.showMessageDialog(null, "Capricornio");
		}
		
		*/

		int date;
		String d, m;

		m = JOptionPane.showInputDialog("Ingrese mes de nacimiento: ");
		d = JOptionPane.showInputDialog("Ingrese dia de nacimiento: ");
		date = Integer.parseInt(m + d);

		if (date <= 100 || date >= 1232) {
			JOptionPane.showMessageDialog(null, "Error mes/dia invalido");
		} else {
			if ((date >= 121 && date <= 131) || (date >= 201 && date <= 218)) {
				// Acuario
				JOptionPane.showMessageDialog(null, "Acuario");

			} else if ((date >= 219 && date <= 229) || (date >= 301 && date <= 320)) {
				// Piscis
				JOptionPane.showMessageDialog(null, "Piscis");
			} else if ((date >= 321 && date <= 331) || (date >= 401 && date <= 420)) {
				// Aries
				JOptionPane.showMessageDialog(null, "Aries");
			} else if ((date >= 421 && date <= 430) || (date >= 501 && date <= 521)) {
				// Tauro
				JOptionPane.showMessageDialog(null, "Tauro");
			} else if ((date >= 522 && date <= 531) || (date >= 601 && date <= 630)) {
				// Geminis
				JOptionPane.showMessageDialog(null, "Geminis");
			} else if ((date >= 622 && date <= 631) || (date >= 701 && date <= 722)) {
				// Cancer
				JOptionPane.showMessageDialog(null, "Cancer");
			} else if ((date >= 723 && date <= 731) || (date >= 801 && date <= 823)) {
				// Leo
				JOptionPane.showMessageDialog(null, "Leo");
			} else if ((date >= 824 && date <= 831) || (date >= 901 && date <= 923)) {
				// Virgo
				JOptionPane.showMessageDialog(null, "Virgo");
			} else if ((date >= 924 && date <= 930) || (date >= 1001 && date <= 1023)) {
				// Libra
				JOptionPane.showMessageDialog(null, "Libra");
			} else if ((date >= 1024 && date <= 1031) || (date >= 1101 && date <= 1122)) {
				// Escorpio
				JOptionPane.showMessageDialog(null, "Escorpio");
			} else if ((date >= 1123 && date <= 1130) || (date >= 1201 && date <= 1221)) {
				// Sagitario
				JOptionPane.showMessageDialog(null, "Sagitario");
			} else if ((date >= 1222 && date <= 1231) || (date >= 101 && date <= 120)) {
				// Capricornio
				JOptionPane.showMessageDialog(null, "Capricornio");
			}
		}
	}

}
