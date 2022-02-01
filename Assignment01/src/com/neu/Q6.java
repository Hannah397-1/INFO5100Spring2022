package com.neu;


//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum $ 200 for up to 100 calls.
//Plus $ 0.60 per call for next 50 calls.
//Plus $ 0.50 per call for next 50 calls.
//Plus $ 0.40 per call for any call beyond 200 calls.
public class Q6 {
    static double telephoneBills(int calls){
        int baseFee = 200;
        double bills = 0;
        String plan = "";
        if(calls > 200){
            plan = "planA";
        }else if (calls >150){
            plan = "planB";
        }else if(calls > 100){
            plan = "planC";
        }else
            plan = "planD";
        switch(plan){
            case "planA":
                bills = 0.4 * (calls-200) + 0.5 * 50 + 0.6 * 50 + baseFee;
                break;
            case "planB":
                bills = 0.5 * (calls - 150) + 0.6 * 50 + baseFee;
                break;
            case "planC":
                bills = 0.6 * (calls - 100) + baseFee;
                break;
            default:
                bills = baseFee;
        }
        return bills;
    }

    public static void main(String[] args) {
        double bills1 = telephoneBills(201);
        System.out.println(bills1);
    }
}
