package com.neu;
// Write a function to calculate the box volume.
public class Q10 {
    public static void main(String[] args) {
        Box box = new Box(25.5,6.5,4.0);
        System.out.println(box.volume());
    }
}

class Box {

    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double volume(){
        return width*height*depth;
    }
}
