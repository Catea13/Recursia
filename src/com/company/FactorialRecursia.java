package com.company;

public class FactorialRecursia {
    public static void main(String[] args) {
        System.out.println(recursia(3));
    }

    public static int recursia(int factor) {
        if (factor == 1)
         return 1 ;
            return factor *recursia (factor - 1);

        }
    }

