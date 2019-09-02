package conej00c;

import java.util.Random;

public class Conej00c {

    public static void main(String[] args) {
        int m, dado1, dado2;
        double dado3;
        Random random = new Random();
        dado1 = random.nextInt(6) + 1; // dado entre 1 y 6
        dado2 = random.nextInt(11) + 10; // dado entre 10 y 20
        dado3 = random.nextDouble() * 100000; // dado entre 0 a 99999.999999...

        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
    }
    
}
