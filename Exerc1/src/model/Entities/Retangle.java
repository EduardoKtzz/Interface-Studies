package model.Entities;

import model.Enums.Color;

public class Retangle extends AbstractShape implements Shape {

    private double width;
    private double height;

    public Retangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }

}
