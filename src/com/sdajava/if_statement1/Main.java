package com.sdajava.if_statement1;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        double x1, x2;

        a = 4;
        b = -2;
        c = 10;


        int delta=(b*b-4*(a*c));
        if(delta<0){
            System.out.println("Brak rozwiązań");
        }
        if(delta==0) {
            x1 = x2 = delta / 2*a;
            System.out.println("Jedno rozwiązanie");
        }
        if(delta>0) {
            x1 = ((-b - Math.sqrt(delta)) / 2 * a);
            x2 = ((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("Dwa rozwiązania" + Math.sqrt(x1) + "i" + Math.sqrt(x2));
        }

        }
}
