package com.neu.q1;

//Implement given program using copy constructor by creating a class
//Student with two parameter
//1. int rollNumber;
//2. String name
public class Q1 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "ABC");

        System.out.println(" Roll number of the first student: "+
                student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());
        Student student2 = new Student(student1);//??????
        System.out.println(" Roll number of the second student: "+
                student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());
    }
}
class Student{
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }

    public String printName(){
        return this.getName();
    }
    public int printRoll(){
        return this.getRollNumber();
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}