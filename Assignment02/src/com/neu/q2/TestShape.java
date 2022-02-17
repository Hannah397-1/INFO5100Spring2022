package com.neu.q2;

public class TestShape {
    public static void main(String[] args) {
        Rhombus rhombus = new Rhombus("RhombusA", "B", 3);
        double area1 = rhombus.getArea();
        System.out.println(area1);

        Triangle triangle1 = new Triangle("TriangleB", "a", 3, 4);
        Triangle triangle2 = new Triangle(3);

        System.out.println(triangle1.getArea());
        System.out.println(triangle2.getArea());

        triangle1.printShape();
    }
}
