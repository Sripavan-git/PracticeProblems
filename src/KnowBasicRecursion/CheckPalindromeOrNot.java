package KnowBasicRecursion;

import java.util.Scanner;

public class CheckPalindromeOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(isPalindrome(0, s));
    }

    public static boolean isPalindrome(int i, String s){
        if(i >= s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length() - i -1)) return false;
        return isPalindrome(i+1, s);
    }
}
