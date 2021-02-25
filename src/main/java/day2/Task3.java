package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner strNumber = new Scanner(System.in);
        int numberOne = strNumber.nextInt();
        int numberTwo = strNumber.nextInt();

        if (numberOne >= numberTwo) {
            System.out.println("Некорректный ввод");
        }

        while (numberTwo > numberOne) {
            numberOne++;
            if (numberOne % 5 == 0 && numberOne % 10 != 0) {
                System.out.print(numberOne + " ");
            }
        }
    }
}
