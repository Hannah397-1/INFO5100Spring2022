package com.neu;

public class Main {


    public static void main(String[] args) {
	// write your code here
        SeattlePoliceDepartment publisher = new SeattlePoliceDepartment();

        Person p1 = new Person("Alexander", 20);
        Person p2 = new Person("William", 35);
        Person p3 = new Person("James", 30);
        Person p4 = new Person("Ada", 25);

        p1.subscribe(publisher);
        p2.subscribe(publisher);
        p3.subscribe(publisher);
        p4.subscribe(publisher);

        publisher.NotifyCitizens("Police Arrest Man for Saturday Shooting in Central District");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p2.unSubscribe(publisher);
        p3.unSubscribe(publisher);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        publisher.NotifyCitizens("Detectives Seek Info on U District Hit-and-Run Vehicle");




    }
}
