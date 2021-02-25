package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner strNumber = new Scanner(System.in);
        int numberOne = strNumber.nextInt();
        int numberTwo = strNumber.nextInt();

        if (numberOne >= numberTwo) {
            System.out.println("Некорректный ввод");
        }

        for (int i = numberOne + 1; i < numberTwo; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
