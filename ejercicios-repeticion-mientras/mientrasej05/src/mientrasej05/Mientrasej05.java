package mientrasej05;

import javax.swing.JOptionPane;

public class Mientrasej05 {

    public static void main(String[] args) {

        /*
        En una universidad se hará un relevamiento entre una cantidad  no 
        determinada de alumnos.
        Se desea obtener
            a) porcentaje de la población femenina
            b) porcentaje población masculina
            c) mejor promedio cuatrimestral de la población femenina
            d) mejor promedio cuatrimestral de la población  masculina
        Los datos que se ingresan son: sexo, promedio, matricula. Para indicar 
        el fin se ingresa un 0 como matricula
         */
        String sexo;
        double promedio, matricula, pmasc = Integer.MIN_VALUE, pfem = Integer.MIN_VALUE, promtotalf, promtotalm;
        int totmf = 0, pm = 0, pf = 0;

        matricula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nº Matricula o 0 para finalizar: "));

        while (matricula != 0) {
            sexo = JOptionPane.showInputDialog("Ingrese sexo (M)asculino o (F)emenino: ");
            promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio: "));

            if (sexo.equalsIgnoreCase("m")) {
                pm++;
                totmf++;
                if (promedio > pmasc) {
                    pmasc = promedio;
                }
            } else {
                pf++;
                totmf++;
                if (promedio > pfem) {
                    pfem = promedio;
                }
            }
            System.out.println("hombres: "+pm);
            System.out.println("mejor promedio H: " +pmasc);
            System.out.println("mujeres: "+pf);
            System.out.println("mejor promedio F: " +pfem);
            
            System.out.println("total HyM: " +totmf);
            
            matricula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nº Matricula o 0 para finalizar: "));
        }

        promtotalf = (pf * 100) / totmf;
        promtotalm = (pm * 100) / totmf;
        
        JOptionPane.showMessageDialog(null, "Porcentaje Femenino: %" +promtotalf
                + "\nPorcentaje Masculino: %" +promtotalm
                + "\nMejor porcentaje Femenino: " +pfem
                + "\nMejor porcentaje Masculino: " +pmasc);

    }

}
