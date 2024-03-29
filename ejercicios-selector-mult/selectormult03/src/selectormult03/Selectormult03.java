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
    	
    	String msj="";
        int cat, hs_trabajo, hs_extra;
        double preciohs, precioextra, totprecio;
        cat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Categoria: \n1 - 2 - 3 "));
        hs_trabajo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas Trabajadas: "));
        hs_extra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas Extra: "));

        switch (cat) {
            case 1:
                preciohs = hs_trabajo * 14;
                precioextra = hs_extra * 20.50; 
                totprecio = preciohs + precioextra;
                if (hs_extra > 30) {
                    totprecio -= totprecio * 0.07;
                }
                msj = "Sueldo de operario: " + totprecio +
                		"\nHoras trabajadas: " + hs_trabajo + " precio: "+preciohs+
                		"\nHoras extra: " + hs_extra + " precio: "+precioextra;
                break;
            case 2:
                preciohs = hs_trabajo * 17;
                precioextra = hs_extra * 24; 
                totprecio = preciohs + precioextra;
                if (hs_extra > 30) {
                    totprecio -= totprecio * 0.07;
                }
                msj = "Sueldo de operario: " + totprecio +
                		"\nHoras trabajadas: " + hs_trabajo + " precio: "+preciohs+
                		"\nHoras extra: " + hs_extra + " precio: "+precioextra;
                break;
            case 3:
                preciohs = hs_trabajo * 21;
                precioextra = hs_extra * 34; 
                totprecio = preciohs + precioextra;
                if (hs_extra > 30) {
                    totprecio -= totprecio * 0.07;
                }
                msj = "Sueldo de operario: " + totprecio +
                		"\nHoras trabajadas: " + hs_trabajo + " precio: "+preciohs+
                		"\nHoras extra: " + hs_extra + " precio: "+precioextra;
                break;
        }
        
        JOptionPane.showMessageDialog(null, msj);

    }

}
