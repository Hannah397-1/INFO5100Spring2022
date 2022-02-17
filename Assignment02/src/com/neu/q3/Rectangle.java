package com.neu.q3;

public class Rectangle extends Shape {
    private String name;
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
    }

    public void computeArea() {
        System.out.println("The area is: " + this.length * this.width);
    }

    public void computePerimeter() {
        System.out.println("The perimeter is: " + (this.length + this.width) * 2);
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }

    @Override
    public String getName() {
        return name;
    }
}
