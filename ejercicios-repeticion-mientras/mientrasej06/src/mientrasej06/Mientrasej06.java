package mientrasej06;

import javax.swing.JOptionPane;

public class Mientrasej06 {

    public static void main(String[] args) {

        /*
        En una escuela se debe determinar cuales son los alumnos que tienen 
        aptitudes para formar el nuevo equipo de básquet:

        Se pide imprimir: 
            a) total de alumnas relevadas
            b) cantidatotal de alumnas relevadas de alumnas que tienen 
            aptitudes para formar el equipo: altura >= 1.73 y peso entre 55 
            y 83 kg
            c) porcentaje que representa la cantidad anterior con respecto al 
            total de alumnas relevadas
            d) total de alumnos varones relevadas
            e) cantidad de alumnos que tienen aptitudes para formar el equipo: 
            altura >= 1.83 y peso entre 73 y 105  kg
            f) porcentaje que representa la cantidad anterior con respecto al 
            total de alumnos varones relevados
            g) total de alumnos relevados
            Este programa finalizara con la pregunta ¿ingresa otro registro?
         */
        int alumnas = 0, alumnos = 0, totalum = 0, ralumnas = 0, ralumnos = 0;
        double altura, peso, palumnas, palumnos, porcentaje, totralumnos;
        String preg, sexo;

        do {

            sexo = JOptionPane.showInputDialog("(M)asculino o (F)emenino ?");
            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura: "));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso: "));

            switch (sexo) {
                case "f":
                    alumnas++;
                    totalum++;
                    if (altura >= 1.73 && peso >= 55 && peso <= 83) {
                        ralumnas++;
                    }
                    break;
                case "m":
                    alumnos++;
                    totalum++;
                    if (altura >= 1.83 && peso >= 73 && peso <= 105) {
                        ralumnos++;
                    }
                    break;
                default:
                    System.out.println("Error sexo");
                    break;
            }
            
            System.out.println("Alumnos: "+alumnos);
            System.out.println("Alumnas: "+alumnas);
            System.out.println("Total: "+totalum);
            System.out.println("Alumnos aptos: " +ralumnos);
            System.out.println("Alumnas aptas: " +ralumnas);
            
            preg = JOptionPane.showInputDialog("¿ingresa otro registro?");

        } while (preg.equalsIgnoreCase("y"));

        palumnas = (ralumnas * 100) / alumnas;
        System.out.println("Porcentaje alumnas relevadas: " +palumnas);
        palumnos = (ralumnos * 100) / alumnos;
        System.out.println("Porcentaje alumnos relevadas: " +palumnos);
        
        totralumnos = ralumnas + ralumnos;
        System.out.println("Total de alumnos relevados: " +totralumnos);
    }

}
