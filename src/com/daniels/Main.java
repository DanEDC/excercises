package com.daniels;

public class Main {

    public static void main(String[] args) {
        double myDouble = 20d;
        double mySecondDouble = 80d;

        double myTotal = (myDouble + mySecondDouble) * 25;
        System.out.println(myTotal);
        double myTotal2 = myTotal % 40;
        System.out.println(myTotal2);
        if (myTotal2 <= 20)
            System.out.println("Total was over the limit");
        double my = 10 % 3;
        System.out.println(my);
    }

}
