package com.company;
//In acest program gasim factorialul 3 fara recursia
public class Factorial {
    public static void main(String[] args) {


        int nr = 1;
        for (int i = 1; i <= 3; i++) {
            nr = nr * i;
        }
        System.out.println("Factorialul 3 este " + nr);
    }
}



