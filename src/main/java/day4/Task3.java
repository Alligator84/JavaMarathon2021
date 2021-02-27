package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] mass = new int[12][8];
        int maxSumma = 0, summa = 0, index = 0;
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {

            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(50);
                summa+=mass[i][j];
            }
            if (summa > maxSumma) {
                maxSumma = summa;
                index = i;
            }
            summa = 0;
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + index);
    }
}
