package extraparcialej02;

import javax.swing.JOptionPane;

public class Extraparcialej02 {

	public static void main(String[] args) {

		/*
		 * En una eleccion se cuentan los votos al mejor compañero (Juan, Pedro o
		 * Maria). Para ganar la eleccion se debe obtener como minimo mas del 50% del
		 * total de los votos. En caso de no haber ganador, se repite la eleccion en una
		 * segunda vuelta, yendo a ésta los dos candidatos que obtengan la mas alta
		 * votacion. Se anula la eleccion en caso de producirse un Empate Doble por el
		 * segundo lugar ó un empate triple. Diseñe un algoritmo que determine el
		 * resultado del a eleccion.
		 */

		// se juntan Votos de Juan Pedro y Maria
		// Si votos mayor a >50% gana
		// Si no hay ganador, se repite eleccion en segunda vuelta balotage
		// con los 2 candidatos con mas alta votacion
		// Doble empate por segundo lugar o empate triple == anula eleccion

		boolean balotage = false;
		String cand1 = "", cand2 = "";
		int vjuan, vpedro, vmaria, vcand1, vcand2;
		double juan, pedro, maria, total;

		// Input
		vjuan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese votos obtenidos por Juan: "));
		vpedro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese votos obtenidos por Pedro: "));
		vmaria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese votos obtenidos por Maria: "));
		total = vjuan + vpedro + vmaria;
		// Porcentaje
		juan = vjuan / total * 100;
		pedro = vpedro / total * 100;
		maria = vmaria / total * 100;

		// Validacion, si empate triple iguales o empate doble x 2dos = se anula
		// eleccion

		if (juan == pedro && pedro == maria) {
			JOptionPane.showMessageDialog(null, "3 iguales, se anula eleccion");

		} else if (juan > pedro && pedro == maria || pedro > juan && juan == maria || maria > pedro && pedro == juan) {
			JOptionPane.showMessageDialog(null, "Los 2dos son iguales, se anula eleccion");
		}

		// si vots > 50% gana
		else if (juan > 50) {
			JOptionPane.showMessageDialog(null, "Ganador es Juan");
		} else if (pedro > 50) {
			JOptionPane.showMessageDialog(null, "Ganador es Pedro");
		} else if (maria > 50) {
			JOptionPane.showMessageDialog(null, "Ganadora es Maria");

			// dos candidatos con mas alta votacion al balotage
		} else if (juan >= pedro && pedro > maria || pedro >= juan && juan > maria) {
			JOptionPane.showMessageDialog(null, "Juan y Pedro son ganadores, hay balotage");
			cand1 = "Juan";
			cand2 = "Pedro";
			balotage = true;
		} else if (juan >= maria && maria > pedro || maria >= juan && juan > pedro) {
			JOptionPane.showMessageDialog(null, "Juan y Maria son ganadores, hay balotage");
			cand1 = "Juan";
			cand2 = "Maria";
			balotage = true;
		} else if (pedro >= maria && maria > juan || maria >= pedro && pedro > juan) {
			JOptionPane.showMessageDialog(null, "Maria y Pedro son ganadores, hay balotage");
			cand1 = "Pedro";
			cand2 = "Maria";
			balotage = true;
		}

		// Balotage entre dos candidatos con mas alta votacion
		if (balotage) {
			JOptionPane.showMessageDialog(null, "Se realiza balotage entre: " + cand1 + " y " + cand2);
			vcand1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese votos para candidato " + cand1));
			vcand2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese votos para candidato " + cand2));
			if (vcand1 > vcand2) {
				JOptionPane.showMessageDialog(null, "Ganador: " + cand1 + "\nVotos: " + vcand1);
			} else if (vcand2 > vcand1) {
				JOptionPane.showMessageDialog(null, "Ganador: " + cand2 +"\nVotos: " + vcand2);
			} else {
				JOptionPane.showMessageDialog(null, "se anula balotage x empate");
			}
		}
	}
}
