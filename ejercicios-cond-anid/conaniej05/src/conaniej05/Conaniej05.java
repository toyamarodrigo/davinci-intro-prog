package conaniej05;

import javax.swing.JOptionPane;

/**
 * @author Rodrigo Toyama <toyama.rodrigo@gmail.com>
 */
public class Conaniej05 {

    /*
    Un postulante a un empleo, realiza un test de capacitación, se obtuvo la 
    siguiente información: cantidad total de preguntas que se le realizaron y 
    la cantidad de preguntas que contestó correctamente. Se pide confeccionar 
    un programa que ingrese los dos datos por teclado e informe el nivel del 
    mismo según el porcentaje de respuestas correctas que ha obtenido, y 
    sabiendo que:
    
	Nivel máximo:               Porcentaje>=90%
	Nivel medio:                Porcentaje>=75% y <90%
	Nivel regular:	            Porcentaje>=50% y <75%
	Fuera de nivel:             Porcentaje<50%
     */
    public static void main(String[] args) {

        double totalpreg, bienpreg;

        totalpreg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese total de preguntas: "));
        bienpreg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de preguntas correctas: "));

        /*
        if (bienpreg > totalpreg) { 
            JOptionPane.showMessageDialog(null, "preguntas correctas no pueden ser mayor a total de preguntas"); 
        } else if(bienpreg <= (totalpreg*0.90) && bienpreg < totalpreg){
            JOptionPane.showMessageDialog(null, "Nivel máximo \nRespuestas correctas: "+bienpreg);
        } else if (bienpreg >= (totalpreg*0.75) && bienpreg < (totalpreg*0.90)){
            JOptionPane.showMessageDialog(null, "Nivel medio \nRespuestas correctas: "+bienpreg);
        } else if (bienpreg >= (totalpreg*0.50) && bienpreg < (totalpreg*0.75)){
            JOptionPane.showMessageDialog(null, "Nivel regular \nRespuestas correctas: "+bienpreg);
        } else if (bienpreg > (totalpreg*0.50)){
            JOptionPane.showMessageDialog(null, "Fuera de nivel \nRespuestas correctas: "+0);
        } 
         */
        
        
        // Worst implementation
        if (bienpreg > totalpreg) {
            JOptionPane.showMessageDialog(null, "preguntas correctas no pueden ser mayor a total de preguntas");
        } else if (bienpreg >= (totalpreg * 0.90)) {
                JOptionPane.showMessageDialog(null, "Nivel máximo \nRespuestas correctas: " + bienpreg);
        } else if (bienpreg >= (totalpreg * 0.75)) {
                JOptionPane.showMessageDialog(null, "Nivel medio \nRespuestas correctas: " + bienpreg);
        } else if (bienpreg >= (totalpreg * 0.50)) {
                JOptionPane.showMessageDialog(null, "Nivel regular \nRespuestas correctas: " + bienpreg);
        } else if (bienpreg < (totalpreg * 0.50)) {
            JOptionPane.showMessageDialog(null, "Fuera de nivel \nRespuestas correctas: " + bienpreg);
        }

    }
}
