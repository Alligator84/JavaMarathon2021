package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner strNumber = new Scanner(System.in);
        double numberX = strNumber.nextDouble();
        double numberY;

        if (numberX > -3.0 && numberX < 5) {
            numberY = (numberX + 3) * (numberX * numberX - 2);
        } else if (numberX >= 5) {
            numberY = (numberX * numberX - 10)/(numberX + 7);
        } else {
            numberY = 420;
        }

        System.out.println(numberY);
    }
}
