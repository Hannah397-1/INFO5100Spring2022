package com.neu;

public class Professor extends Person{
    public Professor(String name, int ID, int age) {
        super(name, ID, age);
    }
    public void giveQuiz(){
        System.out.println("Professor " + this.getName()+" " + this.getID() +" is giving the quiz");
    }
}
