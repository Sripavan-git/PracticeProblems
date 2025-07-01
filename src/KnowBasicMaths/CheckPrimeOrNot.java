package KnowBasicMaths;

import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n + " is a Prime Number");
        }else{
            System.out.println(n + " is not a Prime Number");
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
