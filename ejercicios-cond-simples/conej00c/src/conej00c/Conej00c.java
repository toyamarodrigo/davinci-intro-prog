package conej00c;

import java.util.Random;

public class Conej00c {

    public static void main(String[] args) {
        int m, dado1, dado2, carta;
        double dado3, sueldo, peso;
        Random random = new Random();
        dado1 = random.nextInt(6) + 1; // dado entre 1 y 6
        dado2 = random.nextInt(11) + 10; // dado entre 10 y 20
        dado3 = random.nextDouble() * 100000; // dado entre 0 a 99999.999999...
        carta = random.nextInt(12) + 1; // carta entre 1 y 12
        sueldo = random.nextDouble() * 80000;
        peso = random.nextDouble() * 300;

        System.out.println("dado1: "+dado1);
        System.out.println("dado2: "+dado2);
        System.out.println("dado3: "+dado3);
        System.out.println("carta: "+carta);
        System.out.println("sueldo: "+sueldo);
        System.out.println("peso: "+peso);
    }
    
}
