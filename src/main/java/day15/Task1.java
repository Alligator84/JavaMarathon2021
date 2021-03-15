package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("src/main/resources/shoes.csv");
        File outputFile = new File("src/main/resources/missing_shoes.txt");
        outShoesFile(inputFile, outputFile);
    }

    public static void outShoesFile(File inputFile, File outputFile) {
        try {
            Scanner input = new Scanner(inputFile);
            PrintWriter output = new PrintWriter(outputFile);
            while (input.hasNextLine()) {
                String inputStringFile = input.nextLine();
                String[] strArray = inputStringFile.split(";");
                if (strArray[2].equals("0")) {
                    output.println(inputStringFile);
                }
            }
            input.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input or output file not found");
        }

    }
}
