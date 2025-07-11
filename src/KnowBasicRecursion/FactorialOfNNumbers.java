package KnowBasicRecursion;

import java.util.Scanner;

public class FactorialOfNNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 0)
            return 1;

        return n * factorial(n-1);
    }
}
