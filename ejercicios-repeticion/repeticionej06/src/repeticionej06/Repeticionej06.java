package repeticionej06;

import java.util.Random;
import javax.swing.JOptionPane;

public class Repeticionej06 {

	public static void main(String[] args) {

		/*
		 * Dados n números enteros calcular el rango. Rango: es la diferencia entre el
		 * numero mayor y el menor
		 */
		int numero, rangonum, tot, nummax = Integer.MIN_VALUE, nummin = Integer.MAX_VALUE;
		Random random = new Random();

		rangonum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese max de numeros: "));

		for (int i = 0; i < rangonum; i++) {
			numero = random.nextInt(51);

			if (numero < nummin) {
				nummin = numero;
			}

			if (numero > nummax) {
				nummax = numero;
			}

			System.out.println("Contador: " + i 
					+ "\nNumero random: " + numero 
					+ "\nNumero mayor: " + nummax
					+ "\nNumero menor: " + nummin
					);
		}

		tot = nummax - nummin;

		JOptionPane.showMessageDialog(null,
				"Numero mayor: " + nummax 
				+ "\nNumero menor: " + nummin 
				+ "\nDiferencia entre numeros: " + tot
				);

	}

}
