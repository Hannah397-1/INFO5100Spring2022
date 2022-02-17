package com.neu.q4;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Player tom = new Player("Tom", 20);
        Player anne = new Player("Anne", 25);
        Player jessie = new Player("Jessie", 20);
        Player[] players = {tom, anne, jessie};
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.getScore() == o2.getScore()){
                    return o1.getName().compareTo(o2.getName());
                }else{
                    return o2.getScore() - o1.getScore();
                }
            }
        });

        System.out.println("======Rank=======");
        for(Player player: players){
            player.display();
        }

    }
}