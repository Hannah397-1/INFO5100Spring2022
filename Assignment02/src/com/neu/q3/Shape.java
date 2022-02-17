package com.neu.q3;

public class Shape {
    private String name;
    private double area;
    private double perimeter;

    public Shape() {
    }


    public void display(){
        System.out.println("============Shape Details==========");
        System.out.println("Name: " + this.getName());
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
