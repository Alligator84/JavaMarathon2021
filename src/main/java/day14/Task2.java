package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("people")));
    }

    public static List<String> parseFileToStringList(File file) {
        try {
            List<String> strList = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] strArrays = str.split(" ");
                if (Integer.parseInt(strArrays[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        return null;
                    }
                }
                strList.add(str);
            }
            return strList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        }
    }
}
