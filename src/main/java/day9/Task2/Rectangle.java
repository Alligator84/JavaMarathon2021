package day9.Task2;

import day9.Task2.Figure;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super.setColor(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }
}
