package KnowBasicMaths;

import java.util.Scanner;

//Given two integers N1 and N2, find their greatest common divisor.
// The Greatest Common Divisor of any two integers is the largest number that divides both integers.
// Example :- N1 = 9, N2 = 12
// Output: 3
public class GCD {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println("GCD of the two numbers is ---> "+ findGcd(n1, n2));
    }

    public static int findGcd(int n1, int n2){

        for(int i = Math.min(n1, n2); i > 0; i--){
            if(n1%i ==0 && n2 % i == 0){
                return i;
            }
        }
        return 1;
    }
}
