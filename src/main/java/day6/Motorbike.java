package day6;


public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int motoYear, String motoColor, String motoModel) {
        this.year = motoYear;
        this.color = motoColor;
        this.model = motoModel;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(this.year - inputYear);
    }
}