package com.company;

public class Main {

    public static void main(String[] args) {
	counter(3);
    }

    public static void counter(int n) {
        if(n==0)
            return;
                System.out.println(n);
        counter(n-1);
    }
}
      //  for (int i = 1; i <=3; i++) {//Fara recursia
//            System.out.println(i);
//        }
//    }
//}