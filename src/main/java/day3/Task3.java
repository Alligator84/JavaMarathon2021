package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner strNumber = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double delimoe = strNumber.nextDouble();
            double delitel = strNumber.nextDouble();
            if (delitel == 0) {
                System.out.println("Деление на 0");
                continue;
            } else {
                System.out.println(delimoe / delitel);
            }
        }
    }
}
