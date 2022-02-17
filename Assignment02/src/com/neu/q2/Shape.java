package com.neu.q2;

//Create a Shape class and a sub classes triangle, rhombus
//        Class: Shape
//        Fields: name, color, area, perimeter
public class Shape {
    private String name;
    private String color;
    private double area;
    private double perimeter;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape() {
    }

    public void printShape(){
        System.out.println("====================================");
        System.out.println("This shape is: " + this.getName() + "\n"
                        + "The area is: " + this.getArea());
        System.out.println("The perimeter is: " + this.getPerimeter());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}


