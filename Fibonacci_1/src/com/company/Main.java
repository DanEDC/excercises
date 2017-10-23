package com.company;

public class Main{
    public static void main(String[] args) {

        Fibonacci(12);
    }

    public static void Fibonacci(int n) {
        if (n<0){
            System.out.println("The number is invalid");
        }
        if (n == 0) {
            System.out.println("For number 0, Fibonacci number is 0");
        }
        if (n == 1) {
            System.out.println("For number 1, Fibonacci number is 1");
        } if (n>=2) {
            int FibonacciNumber = ((n - 1) + (n - 2));
            System.out.println("For number " + n + " Fibonacci number is " + FibonacciNumber);
        }
    }

}


