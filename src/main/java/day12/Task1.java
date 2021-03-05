package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(6);

        arrayList.add("lada");
        arrayList.add("bmw");
        arrayList.add("mers");
        arrayList.add("honda");
        arrayList.add("toyota");

        arrayList.add(3, "nissan");

        arrayList.remove(0);

        System.out.println(arrayList);
    }
}
