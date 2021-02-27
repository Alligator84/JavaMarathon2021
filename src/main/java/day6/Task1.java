package day6;

public class Task1 {
    public static void main(String[] args) {
        Car carOne = new Car();
        Motorbike motoOne = new Motorbike(2020, "Red", "kawa");
        carOne.info();
        System.out.println(carOne.yearDifference(1500));
        motoOne.info();
        System.out.println(motoOne.yearDifference(2030));
    }
}
