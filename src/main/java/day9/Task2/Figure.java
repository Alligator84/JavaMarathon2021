package day9.Task2;

public abstract class Figure {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double area();
    public abstract double perimeter();
}
