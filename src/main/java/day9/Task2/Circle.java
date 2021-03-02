package day9.Task2;

import day9.Task2.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
