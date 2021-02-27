package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inLengthMassiv = new Scanner(System.in);
        Random rnd = new Random();
        int lengthMassiv = inLengthMassiv.nextInt();
        int[] intMassiv = new int[lengthMassiv];
        int over8 = 0, equals1 = 0, chet = 0, nonchet = 0, summ = 0;

        for(int i = 0; i < intMassiv.length; i++) {
            intMassiv[i] = rnd.nextInt(10);
        }

        System.out.print("[");

        for(int i = 0; i < intMassiv.length; i++) {
            // if not use Arrays.toString().
            if (i < lengthMassiv - 1) {
                System.out.print(intMassiv[i] + ", ");
            } else {
                System.out.print(intMassiv[i]);
            }

            if (intMassiv[i] > 8) {
                over8++;
            } else if (intMassiv[i] == 1) {
              equals1++;
            } else if (intMassiv[i] % 2 == 0) {
                chet++;
            } else if (intMassiv[i] % 2 != 0) {
                nonchet++;
            }
            summ = summ + intMassiv[i];
        }

        System.out.println("]");
        System.out.println("");
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива:                " + intMassiv.length);
        System.out.println("Количество чисел больше 8:    " + over8);
        System.out.println("Количество чисел равных 1:    " + equals1);
        System.out.println("Количество четных чисел:      " + chet);
        System.out.println("Количество нечетных чисел:    " + nonchet);
        System.out.println("Сумма всех элементов массива: " + summ);

    }
}
