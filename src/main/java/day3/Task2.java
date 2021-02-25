package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner strNumber = new Scanner(System.in);
        double delimoe = strNumber.nextDouble();
        double delitel = strNumber.nextDouble();

        while (true) {
            if (delitel == 0) {
                break;
            }
            System.out.println(delimoe / delitel);
            delimoe = strNumber.nextDouble();
            delitel = strNumber.nextDouble();
        }
    }
}
