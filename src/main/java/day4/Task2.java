package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] members = new int[100];
        Random rnd = new Random();
        int max = 0, min = 0, quantity = 0, sum = 0;

        for (int i = 0; i < members.length; i++) {
            members[i] = rnd.nextInt(10000);
        }

        for (int element : members) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
            if (element % 10 == 0) {
                sum+=sum;
                quantity++;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + quantity);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}
