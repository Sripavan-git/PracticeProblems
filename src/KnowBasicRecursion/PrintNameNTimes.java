package KnowBasicRecursion;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
    }
    public static void print(int i ,int n){
        if(i > n)
            return;
        System.out.println("Helloo");
        print(i+1, n);
    }

}
