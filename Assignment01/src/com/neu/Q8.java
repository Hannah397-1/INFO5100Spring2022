package com.neu;

//Write a program that prompts the user’s grade.
//Your program should display the corresponding meaning of grade as per the following table
public class Q8 {
    public static void main(String[] args) {
        Student student = new Student("Jessica","A");
        Student student1 = new Student("Tom","B");
        student.printGrade();
        student1.printGrade();

    }
}
class Student {
    String name;
    String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void printGrade(){
        switch(this.grade){
            case "A":
                System.out.println("Hello " + this.getName() + ". Your Grade is: " + this.getGrade() + " --Excellent");
                break;
            case "B":
                System.out.println("Hello " + this.getName() + ". Your Grade is: " + this.getGrade() + " --Good");
                break;
            case "C":
                System.out.println("Hello " + this.getName() + ". Your Grade is: " + this.getGrade() + " --Average");
                break;
            case "D":
                System.out.println("Hello " + this.getName() + ". Your Grade is: " + this.getGrade() + " --Deficient");
                break;
            case "F":
                System.out.println("Hello " + this.getName() + ". Your Grade is: " + this.getGrade() + " --Falling");
                break;

        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}