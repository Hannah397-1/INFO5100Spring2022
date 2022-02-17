package com.neu.q2;

import java.text.DecimalFormat;

public class Rhombus extends Shape {
    private double diagonalD1;
    private double diagonalD2;

    public Rhombus(String name, String color, double diagonalD1, double diagonalD2) {
        super(name, color);
        this.diagonalD1 = diagonalD1;
        this.diagonalD2 = diagonalD2;
    }

    //both diagonals have the same length
    public Rhombus(String name, String color, double diagonalD1) {
        super(name, color);
        this.diagonalD1 = diagonalD1;
        this.setDiagonalD2(diagonalD1);
    }

    @Override
    public double getArea() {
        return this.getDiagonalD1() * this.getDiagonalD2() / 2;
    }

    @Override
    public double getPerimeter() {
        return 4 * Math.sqrt(Math.pow(this.getDiagonalD1() / 2, 2) + Math.pow(this.getDiagonalD2() / 2, 2));
    }

    public double getDiagonalD1() {
        return diagonalD1;
    }

    public void setDiagonalD1(double diagonalD1) {
        this.diagonalD1 = diagonalD1;
    }

    public double getDiagonalD2() {
        return diagonalD2;
    }

    public void setDiagonalD2(double diagonalD2) {
        this.diagonalD2 = diagonalD2;
    }
}
