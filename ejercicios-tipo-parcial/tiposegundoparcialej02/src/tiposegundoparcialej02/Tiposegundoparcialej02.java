package tiposegundoparcialej02;

import java.util.Random;

public class Tiposegundoparcialej02 {

    public static void main(String[] args) {

        /*
        El Gobierno de una provincia quiere hacer un estudio de hábitos de 
        consumo de alcohol y bebida entre la juventud . Para ello, ha escogido 
        una ciudad de la provincia donde llevará  a cabo la consulta, para ello 
        se recogerá el número de litros consumidos durante el mes pasado de los 
        5 tipos de bebidas nombrados a continuación: 
        
        Tipos De Bebidas

        0. Naturales: agua, leche, zumos, mostos, infusiones, ... 
        1. Gaseosas
        2. Vinos 
        3. Cervezas 
        4. Otros: licores,  whiskis, ginebra, fernet, etc

        a. Almacena la información en un array, sobre los litros consumidos 
        de los tipos de bebidas mencionados (generar al azar un valor para cada 
        uno (0-1000)
        b. Determina el “tipo de bebida” más consumida entre los jóvenes
        c. De los “tipos de bebidas” con alcohol, ¿cuál es el más consumido?
        d. Indicar cantidad total de bebidas con alcohol y sin alcohol consumidas
         */
        int max = 0, maxal = 0, i, mascon = 0, masconal = 0, bebsin = 0, bebcon = 0;
        int[] bebidas = new int[4];

        Random random = new Random();

        for (i = 0; i < bebidas.length ; i++) {
            bebidas[i] = random.nextInt(1000);
            System.out.println(bebidas[i]);
        }

        for (i = 0; i < bebidas.length ; i++) {
            if (bebidas[i] > max) {
                max = bebidas[i];
                mascon = i;
            }
            switch (i) {
                case 0:
                case 1:
                    bebsin = bebsin + bebidas[i];
                    break;
                case 2:
                case 3:
                case 4:
                    bebcon = bebcon + bebidas[i];
                    if (bebidas[i] > maxal) {
                        maxal = bebidas[i];
                        masconal = i;
                    }
            }
        }

        if (bebsin >= bebcon) {
            System.out.println("se consume mas sin alcohol");
        } else {
            System.out.println("se consume mas con alcohol");
        }

        System.out.println("Bebida mas consumida: " + mascon
                + "\nBebida c/alcohol mas consumida: " + masconal
                + "\nTotal c/alcohol: " + bebcon
                + "\nTotal s/alcohol: " + bebsin);

    }

}
