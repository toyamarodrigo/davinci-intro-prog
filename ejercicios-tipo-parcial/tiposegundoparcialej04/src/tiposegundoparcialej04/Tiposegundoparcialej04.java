package tiposegundoparcialej04;

import javax.swing.JOptionPane;

public class Tiposegundoparcialej04 {

    public static void main(String[] args) {

        /*
        
        En la estación de servicio SUPER  nos han pedido que realicemos un 
        estudio sobre el uso de los distintos surtidores de combustible a lo 
        largo de un día. En la estación hay 4 surtidores que cada noche se 
        rellenan a 5000 litros y se los numera del 0 al 3 
        0-super /1-nafta común /2-diesel  /3-diesel especial. 
        Se tendrá como dato la cantidad vendida de cada uno de ellos (pedirla 
        como dato de ingreso). Se pide calcular:
        
        - Que tipo de combustible tiene la mayor venta 
        - Que tipo de combustible tiene la menor venta 
        - Cuanto nos queda de combustible en cada tanque al final del día (guardar stock en un array)
        - Cual es el tipo de combustible mas consumido? Nafta o diesel

        */
        int i, may = Integer.MIN_VALUE, men = Integer.MAX_VALUE, tipomay=0, tipomen=0, totnaf, totdie;
        int[] combus = new int[4];
        int[] stock = new int[4];
        
        for(i=0 ; i<=3 ; i++) {
            combus[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta de combustible ml: "));
            System.out.println("Combustible"+i+": "+combus[i]);
        }
        
        for(i=0 ; i<=3 ; i++) {
            
            if(combus[i] > may) {
                may = combus[i];
                tipomay = i;
            }
            
            if(combus[i] < men) {
                men = combus[i];
                tipomen = i;
            }
            
            stock[i] = 5000 - combus[i];
            
        }
        
        totnaf = combus[0] + combus[1];
        totdie = combus[2] + combus[3];
        
        if(totnaf > totdie) {
            System.out.println("Mas consumido nafta: " +totnaf);
        } else {
            System.out.println("Mas consumido diesel: " +totdie);  
        }
        
        System.out.println("Combustible mayor venta: " +tipomay+ " con: " +may 
                + "\nCombustible menor venta: " +tipomen+ " con: " +men);
        
        for(i=0 ; i<=3 ; i++) {
            System.out.println("Stock"+i+": " +stock[i]);
        }
        
    }
    
}
