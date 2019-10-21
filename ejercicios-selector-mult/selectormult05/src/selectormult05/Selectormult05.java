package selectormult05;

import javax.swing.JOptionPane;

public class Selectormult05 {

    public static void main(String[] args) throws Exception {

        /*
        Una empresa utiliza el siguiente tipo de comercializacion para sus 
        productos. Se tienen 2 productos A y B, el producto A tiene tres tipos 
        de fragancias diferentes (primavera, marino y otoño) y el proucto B 
        tiene tres tipos de presentaciones diferentes (pequeño, mediano y 
        grande)
        COSTO
        PRODUCTO A
        Otoño       $1.50
        Primavera   $1.55
        Marino      $1.60

        PRODUCTO B
        grande      $2.05
        mediano     $1.60
        pequeño     $1.10

        Indicar valor de la compra, si solo se puede comprar un solo tipo de 
        producto y si la cantidad comprada supera los $100, se debe realizar 
        un descuento del 10% sobre el total de la compra
         */
        int cant, fragancia, tamano;
        double tot;

        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));

        /*
        fragancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de fragancia: "
                + "\n1) Otoño"
                + "\n2) Primavera"
                + "\n3) Marino"));
        tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño: "
                + "\n1) Grande"
                + "\n2) Mediano"
                + "\n3) Chico"));

        switch (fragancia) {
            case 1:
                switch (tamano) {
                    case 1:
                        tot = 1.50 * 2.05 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    case 2:
                        tot = 1.50 * 1.60 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    case 3:
                        tot = 1.50 * 1.10 * cant;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "tamaño incorrecto");
                        break;
                }
                break;
            case 2:
                switch (tamano) {
                    case 1:
                        tot = 1.50 * 2.05 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    case 2:
                        tot = 1.55 * 1.60 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    case 3:
                        tot = 1.60 * 1.10 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "tamaño incorrecto");
                        break;
                }
                break;
            case 3:
                switch (tamano) {
                    case 1:
                        tot = 1.50 * 2.05 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    case 2:
                        tot = 1.55 * 1.60 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    case 3:
                        tot = 1.60 * 1.10 * cant;
                        JOptionPane.showConfirmDialog(null, "total: " + tot);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "tamaño incorrecto");
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Fragancia incorrecta");
        }
         */
        int producto, tipoa, tipob;

        producto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de producto "
                + "\n1) A"
                + "\n2) B"));

        tipoa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de fragancia: "
                + "\n1) Otoño"
                + "\n2) Primavera"
                + "\n3) Marino"));

        tipob = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de presentacion: "
                + "\n1) Grande"
                + "\n2) Mediano"
                + "\n3) Chico"));
        
        switch (producto) {
            case 1:
                switch (tipoa) {
                    case 1:
                        tot = 1.50 * cant;
                        
                        if(tot > 100) { tot -= tot*0.10; } 
                        
                        JOptionPane.showMessageDialog(null, "Total: " + tot);
                        break;
                    case 2:
                        tot = 1.55 * cant;
                        
                        if(tot > 100) { tot -= tot*0.10; } 
                        
                        JOptionPane.showMessageDialog(null, "Total: " + tot);
                        break;
                    case 3:
                        tot = 1.60 * cant;
                        
                        if(tot > 100) { tot -= tot*0.10; } 
                        
                        JOptionPane.showMessageDialog(null, "Total: " + tot);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error tipo de productoA");
                        break;
                }
                break;
            case 2:
                switch (tipob) {
                    case 1:
                        tot = 2.05 * cant;
                        
                        if(tot > 100) { tot -= tot*0.10; } 
                        
                        JOptionPane.showMessageDialog(null, "Total: " + tot);
                        break;
                    case 2:
                        tot = 1.60 * cant;
                        
                        if(tot > 100) { tot -= tot*0.10; } 
                        
                        JOptionPane.showMessageDialog(null, "Total: " + tot);
                        break;
                    case 3:
                        tot = 1.10 * cant;
                        
                        if(tot > 100) { tot -= tot*0.10; } 
                        
                        JOptionPane.showMessageDialog(null, "Total: " + tot);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error tipo de productoB");
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error tipo de producto");
                break;
        }

    }

}
