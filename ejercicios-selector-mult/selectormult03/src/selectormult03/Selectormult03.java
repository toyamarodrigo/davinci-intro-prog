package selectormult03;

import javax.swing.JOptionPane;

public class Selectormult03 {

	public static void main(String[] args) {

		/*
		 * Calcular el sueldo de un operario teniendo en cuenta la cantida de horas
		 * extras y la cant de horas, de acuerdo a los valores indicados
		 * 
		 * Categoria		Precio Hora			Precio Hora Extra
		 * 1				$14					$20.50	
		 * 
		 * 2				$17					$24
		 * 
		 * 3				$21					$34
		 * 
		 * 
		 * Cada trabajador puede tener como maximo 30 horas extras, si tiene mas se
		 * le paga un 7% menos del valor indicado en la tabla a cada categoria.
		 * 
		 * */
		
		int cat, hs_trabajo;
		cat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Categoria: \n1 - 2 - 3 "));
		hs_trabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas Trabajadas: "));
		
		switch(cat) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			break;
		}
		
	}

}
