package KnowBasicMaths;

// Return Palindrome Number if the Number is Palindrome or else
// Return Not a Palindrome if the number is not

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(isPalindromeOrNot(n)){
            System.out.println( n + " is a Palindrome Number");
        }else{
            System.out.println( n + " is Not a Palindrome Number");
        }

    }

    public static boolean isPalindromeOrNot(int n){

        int reverseNum = 0;
        int dup = n;
        while(n > 0){
            int last = n % 10;
            reverseNum = (reverseNum * 10) + last;
            n = n/10;
        }

        if(dup == reverseNum){
            return true;
        }else{
            return false;
        }
    }
}
