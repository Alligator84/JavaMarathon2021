package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motoOne = new Motorbike(2020, "Black", "Kawasaki 1010");
        System.out.println(motoOne.getYear());
        System.out.println(motoOne.getModel());
        System.out.println(motoOne.getColor());
    }
}

class Motorbike {
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
}