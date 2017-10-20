package com.daniels;

public class Main {

    public static void main(String[] args) {

        byte myByte = -100;
        byte myTotalByte = (byte) (myByte / 13);

        short myShort = 32000;
        short myTotalShort = (short) (myShort / 111);

        int myInt = 1331432131;
        int myTotalInt = ((myInt - 1000222) / 500);

        long myLong = 11111111111111L;
        long myTotalLong = (long) (50000 + (10 * (myTotalByte + myShort + myTotalInt)));
        System.out.println(myTotalLong);
    }
}
