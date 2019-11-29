package matrizej00;

import java.util.Random;

public class Matrizej00 {

    public static void main(String[] args) {

        Random random = new Random();

        int k, i;
        int[][] mat = new int[4][4];

        for (k = 0; k < 3; k++) {
            for (i = 0; i < 3; i++) {
                mat[k][i] = random.nextInt(101);
                System.out.print("-" + mat[k][i]);
            }
            System.out.println("");
        }

    }

}
