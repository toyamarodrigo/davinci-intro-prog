package selectormult04;

import javax.swing.JOptionPane;

public class Selectormult04 {

	public static void main(String[] args) {
		
		/*
		 * Se pide determinar si los alumnos pueden acceder a la beca o
		 * no de acuerdo a su promedio:
		 * 
		 * Carrera				Cuatri			Promedio
		 * 1 Economia			>=6				>9.0	
		 * 2 Informatica		>6				>9.2
		 * 3 Agronomia			>5				>8.8
		 * 4 Contabilidad		>=6				>9.0
		 * 5 Quimica			>5				>8.8
		 * 6 Sistemas			>6				>9.2
		 * 
		 * */
		
		int carrera;
		double cuatri1, cuatri2, prom;
		
		carrera = Integer.parseInt(JOptionPane.showInputDialog(
				"Ingrese Carrera: "
				+ "\n1) Economia"
				+ "\n2) Informatica"
				+ "\n3) Agronomia"
				+ "\n4) Contabilidad"
				+ "\n5) Quimica"
				+ "\n6) Sistemas"
				));
		
		cuatri1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota 1er Cuatrimestre: "));
		cuatri2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota 2do Cuatrimestre: "));
		prom = (cuatri1 + cuatri2) / 2;
		
		
		switch(carrera) {
		case 1:
			if(cuatri1 >= 6 && cuatri2 >= 6) {
				if(prom > 9.0) {
					JOptionPane.showMessageDialog(null, "Tiene beca, promedio de mayor a 9. \nPromedio: "+prom);
				} else {
					JOptionPane.showMessageDialog(null, "No tiene beca, promedio menor a 9. \nPromedio: "+prom);
				}
			} else {
				JOptionPane.showMessageDialog(null, "No accede a beca");				
			}
			break;
		case 2:
			if(cuatri1 > 6 && cuatri2 > 6) {
				if(prom > 9.2) {
					JOptionPane.showMessageDialog(null, "Tiene beca, promedio de mayor a 9,2. \nPromedio: "+prom);
				} else {
					JOptionPane.showMessageDialog(null, "No tiene beca, promedio menor a 9,2. \nPromedio: "+prom);
				}
			} else {
				JOptionPane.showMessageDialog(null, "No accede a beca");				
			}
			break;
		case 3:
			if(cuatri1 > 5 && cuatri2 > 5) {
				if(prom > 8.8) {
					JOptionPane.showMessageDialog(null, "Tiene beca, promedio de mayor a 8,8. \nPromedio: "+prom);
				} else {
					JOptionPane.showMessageDialog(null, "No tiene beca, promedio menor a 8,8. \nPromedio: "+prom);
				}
			} else {
				JOptionPane.showMessageDialog(null, "No accede a beca");				
			}
			break;
		case 4:
			if(cuatri1 >= 6 && cuatri2 >= 6) {
				if(prom > 9.0) {
					JOptionPane.showMessageDialog(null, "Tiene beca, promedio de mayor a 9. \nPromedio: "+prom);
				} else {
					JOptionPane.showMessageDialog(null, "No tiene beca, promedio menor a 9. \nPromedio: "+prom);
				}
			} else {
				JOptionPane.showMessageDialog(null, "No accede a beca");				
			}
			break;
		case 5:
			if(cuatri1 > 5 && cuatri2 > 5) {
				if(prom > 8.8) {
					JOptionPane.showMessageDialog(null, "Tiene beca, promedio de mayor a 8,8. \nPromedio: "+prom);
				} else {
					JOptionPane.showMessageDialog(null, "No tiene beca, promedio menor a 8,8. \nPromedio: "+prom);
				}
			} else {
				JOptionPane.showMessageDialog(null, "No accede a beca");				
			}
			break;
		case 6:
			if(cuatri1 > 6 && cuatri2 > 6) {
				if(prom > 9.2) {
					JOptionPane.showMessageDialog(null, "Tiene beca, promedio de mayor a 9,2. \nPromedio: "+prom);
				} else {
					JOptionPane.showMessageDialog(null, "No tiene beca, promedio menor a 9,2. \nPromedio: "+prom);
				}
			} else {
				JOptionPane.showMessageDialog(null, "No accede a beca");				
			}
			break;
		}
		
		
	}

}
