package com.neu;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> persons;
    String message;

    public SeattlePoliceDepartment() {
        this.persons = new ArrayList<>();
    }

    public void NotifyCitizens(String message){
        this.message = message;
        for(Person p: persons){
            p.getNotification(this);
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
