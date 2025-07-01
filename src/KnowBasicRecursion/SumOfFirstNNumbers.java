package KnowBasicRecursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(0, n);
    }

    public static void print(int sum, int n){
        if(n<0){
            System.out.println(sum);
            return;
        }
        print(sum+n, n-1);
    }
}
