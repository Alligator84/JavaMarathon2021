package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt();
        }

        int k = 0;
        int summa = 0, maxSumma = 0, index = 0;
        while (k < mass.length - 3) {
            summa = mass[k] + mass[k + 1] + mass[k + 2];
            k++;
            if (summa > maxSumma) {
                maxSumma = summa;
                index = k;
            }
        }

        System.out.println(summa);
        System.out.println(index);
    }
}