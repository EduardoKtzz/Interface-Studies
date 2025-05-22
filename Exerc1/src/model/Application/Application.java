package model.Application;

import model.Entities.AbstractShape;
import model.Entities.Circle;
import model.Entities.Retangle;
import model.Enums.Color;

public class Application {
    public static void main(String[] args) {

        AbstractShape shape = new Circle(Color.BLACK, 2.0);
        AbstractShape shape1 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + shape.getColor());
        System.out.println("Circle area: " + String.format("%.3f", shape.area()));

        System.out.println();
        System.out.println("Rectangle color: " + shape1.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", shape1.area()));
    }
}

