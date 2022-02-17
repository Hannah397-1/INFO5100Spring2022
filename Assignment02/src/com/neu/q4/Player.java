package com.neu.q4;

//You must create Player class. It has 2 fields:a String name and a score integer.
//Given an array of Player objects, write a comparator that sorts them in order of
// decreasing score; if 2 or more players have the same score, sort those players
// alphabetically by name.
public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void display() {
        System.out.println("Name: " + this.getName() + "\t" + "Score: " + this.getScore());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}



