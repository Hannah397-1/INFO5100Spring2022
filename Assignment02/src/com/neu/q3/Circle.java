package com.neu.q3;

public class Circle extends Shape {
    private String name;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    double computeArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    double computePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public double getArea(){
        return computeArea();
    }

    @Override
    public double getPerimeter(){
        return computePerimeter();
    }

    @Override
    public String getName() {
        return name;
    }
}
