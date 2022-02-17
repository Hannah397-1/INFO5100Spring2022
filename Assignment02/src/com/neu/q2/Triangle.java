package com.neu.q2;

import java.text.DecimalFormat;

public class Triangle extends Shape {
    double base;
    double height;
    double side;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //  If the single side is given then all sides to the same value.
    public Triangle(double side) {
        this.side = side;
        this.setBase(side);
        this.setHeight(Math.sqrt(3) / 2 * side);
    }

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getBase() * this.getHeight() / 2;
    }

    @Override
    public double getPerimeter() {
        if(this.getSide() != 0){
            return side * 3;
        }else{
            System.out.println("Lack of information. Cannot calculate the perimeter. Please provide the length of other two sides.");
            return -1;
        }
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
