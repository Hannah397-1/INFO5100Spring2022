package com.neu;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getNotification(SeattlePoliceDepartment spd){
        System.out.println("*********************");
        System.out.println("Seattle Police Department Release" );
        System.out.println("This message is sent to: " + this.getName());
        System.out.println("Message: " + spd.message);
        System.out.println("*********************");
    }

    public void subscribe(SeattlePoliceDepartment spd){
        if(!spd.persons.contains(this)){
            spd.persons.add(this);
        }
    }
    public void unSubscribe(SeattlePoliceDepartment spd){
        spd.persons.remove(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
