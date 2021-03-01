package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            str = str.append(i + " ");
        }
        long finish = System.nanoTime();
        long timeSB = finish - start;
        System.out.println(timeSB);
       // System.out.println(str);

        long start2 = System.nanoTime();
        String str2 = "";
        for (int i = 0; i < 20001; i++) {
            str2 = str2 + i + " ";
        }
        long finish2 = System.nanoTime();
        long time = finish2 - start2;
        System.out.println(time);
    }
}
