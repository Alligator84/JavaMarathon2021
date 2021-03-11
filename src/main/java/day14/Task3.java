package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("people")).toString());
    }

    public static List<Human> parseFileToObjList(File file) {
        List<Human> strList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] strArrays = str.split(" ");
                if (Integer.parseInt(strArrays[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        return strList  ;
                    }
                }

                Human human = new Human(strArrays[0], Integer.parseInt(strArrays[1]));
                strList.add(human);
            }
            return strList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return strList;
        }
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "{name='"+name +"'" + ", " + "year=" + age + "}";
    }
}
