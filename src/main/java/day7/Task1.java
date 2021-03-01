package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airOne = new Airplane("Boing", 2020, 1500, 200);
        Airplane airTwo = new Airplane("SSJ-100", 2021, 1400, 200);
        Airplane.compareAirplanes(airOne, airTwo);
    }
}