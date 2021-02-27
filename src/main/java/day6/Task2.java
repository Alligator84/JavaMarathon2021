package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2020, 150, 25);
        airplane.setYear(2021);
        airplane.setLength(190);
        airplane.fillUp(150);
        airplane.fillUp(2500);
        airplane.info();
    }
}
