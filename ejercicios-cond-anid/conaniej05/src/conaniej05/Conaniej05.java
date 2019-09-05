package conaniej05;

import javax.swing.JOptionPane;

/** @author Rodrigo Toyama <toyama.rodrigo@gmail.com> */
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
        
        int totalpreg, bienpreg;
        
        totalpreg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese total de preguntas: "));
        bienpreg = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de preguntas correctas: "));
        
        if (bienpreg > totalpreg) { JOptionPane.showMessageDialog(null, "preguntas correctas no pueden ser mayor a total de preguntas"); }
        
        if(bienpreg >= (totalpreg*90)/100){
            JOptionPane.showMessageDialog(null, "Nivel máximo \nRespuestas correctas: "+bienpreg);
        } else if (bienpreg >= (totalpreg*75)/100 && bienpreg < (totalpreg*90)/100){
            JOptionPane.showMessageDialog(null, "Nivel medio \nRespuestas correctas: "+bienpreg);
        } else if (bienpreg >= (totalpreg*50)/100 && bienpreg < (totalpreg*75)/100){
            JOptionPane.showMessageDialog(null, "Nivel regular \nRespuestas correctas: "+bienpreg);
        } else if (bienpreg > (totalpreg*50)/100){
            JOptionPane.showMessageDialog(null, "Fuera de nivel \nRespuestas correctas: "+bienpreg);
        }
    }
    
}
