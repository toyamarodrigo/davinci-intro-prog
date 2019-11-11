package mientrasej03;

import javax.swing.JOptionPane;

public class Mientrasej03 {

    public static void main(String[] args) {

        /*
        Se desea calcular el puntaje de un equipo de fútbol al finalizar el 
        campeonato. Se distinguen con la letra “G” los partidos ganados, 
        con “E” los empatados y con “P” los perdidos. 
        Para indicar el fin se ingresara un “ * “                
            -realizar el programa
            - modificar el programa anterior de modo tal que indique el número 
        de partidos ganados, el de perdidos y el de empatados
        
        Ganas 3pts, Empate 1pts, Perder 0pts.
         */
        int tot = 0, m = 0, v = 0, e = 0, p = 0;
        String resultado;

        resultado = JOptionPane.showInputDialog("Gano(v), Empato(e) o Perdio(p)?");

        while (!resultado.equalsIgnoreCase("*")) {
            switch (resultado) {
                case "v":
                    tot += 3;
                    v++;
                    m++;
                    break;
                case "e":
                    tot += 1;
                    e++;
                    m++;
                    break;
                case "p":
                    p++;
                    m++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "error");
                    break;
            }
            
            resultado = JOptionPane.showInputDialog("Gano(v), Empato(e) o Perdio(p)?");
        }
        JOptionPane.showMessageDialog(null, "Jugó " + m + " partidos"
                + "\nGanó: " + v
                + "\nEmpató:" + e
                + "\nPerdió: " + p
                + "\n Con un total de " + tot + " puntos");

    }

}
