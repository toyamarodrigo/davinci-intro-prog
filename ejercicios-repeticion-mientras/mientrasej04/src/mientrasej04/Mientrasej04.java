package mientrasej04;

import javax.swing.JOptionPane;

public class Mientrasej04 {

    public static void main(String[] args) {

        /*
        Se pide realizar una factura de Edenor. Por cada cliente se ingresar 
        el nombre, tipo de cliente, dirección, registro inicial de medidor y 
        registro final de medidor. Para finalizar se ingresara un  *  en nombre 
        de cliente
        
        Tipo de cliente
        A o C           hasta 140 o menos $3.20; >140 y <300 $4, si >300 $4.5
        
        B o D           hasta 200 o menos $4.5; si >200 $5.3
        
        Al finalizar el dia se pide indicar
            a) cantidad de facturas realizadas
            b) total de monto facturado
            c) total de kv/h consumidos
         */
        String nombre, tipo, dir;
        int regi, regf;
        double regtot, monto = 0, totmonto = 0, tkvm = 0, f = 0;

        nombre = JOptionPane.showInputDialog("Ingrese nombre o '*' para finalizar");
        tipo = JOptionPane.showInputDialog("Ingrese tipo A B C o D");
        dir = JOptionPane.showInputDialog("Ingrese direccion");
        regi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese registro inicial de medidor"));
        regf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese registro final de medidor"));
        regtot = regf - regi;

        while (!nombre.equalsIgnoreCase("*")) {
            if (tipo.equalsIgnoreCase("a") || tipo.equalsIgnoreCase("c")) {
                if (regtot <= 140) {
                    monto = regtot * 3.20;
                } else if (regtot > 140 && regtot < 300) {
                    monto = regtot * 4;
                } else if (regtot > 300) {
                    monto = regtot * 4.5;
                }
            } else if (tipo.equalsIgnoreCase("b") || tipo.equalsIgnoreCase("d")) {
                if (regtot <= 200) {
                    monto = regtot * 4.5;
                } else {
                    monto = regtot * 5.3;
                }
            }

            f++;
            totmonto += monto;
            tkvm += regtot;

            nombre = JOptionPane.showInputDialog("Ingrese nombre o '*' para finalizar");
            tipo = JOptionPane.showInputDialog("Ingrese tipo A B C o D");
            dir = JOptionPane.showInputDialog("Ingrese direccion");
            regi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese registro inicial de medidor"));
            regf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese registro final de medidor"));
            regtot = regf - regi;
        }
        
        JOptionPane.showMessageDialog(null, "Cantidad de facturas emitidas: " + f + 
                "\nTotal Facturado: " + totmonto + 
                "\nTotal kv/h consumidos: " +tkvm);

    }

}
