package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        printSumDigits(new File("numbers"));
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String str = scanner.nextLine();
            String[] numbersString = str.split(" ");

            if (numbersString.length == 10) {

                int[] numbers = new int[10];
                int counter = 0;
                int sum = 0;
                for (String number : numbersString) {
                    counter = Integer.parseInt(number);
                    sum+=counter;
                }
                System.out.println(sum);

            } else {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Проверьте количество чисел в файле! Должно быть 10.");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
