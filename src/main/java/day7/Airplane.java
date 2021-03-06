package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public static void compareAirplanes(Airplane airOne, Airplane airTwo) {
        if (airOne.length > airTwo.length) {
            System.out.println(airOne.producer + " длиннее самолета " + airTwo.producer);
        } else if (airOne.length == airTwo.length) {
            System.out.println("Длины обоих самолетов равны");
        } else {
            System.out.println(airTwo.producer + " длиннее самолета " + airOne.producer);
        }
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.print("Изготовитель: " + this.producer);
        System.out.print(", год выпуска: " + this.year);
        System.out.print(", длина: " + this.length);
        System.out.print(", вес: " + this.weight);
        System.out.println(", количество топлива в баке: " + this.fuel);
    }

    public void fillUp(int n) {
        this.fuel = this.fuel + n;
    }
}
