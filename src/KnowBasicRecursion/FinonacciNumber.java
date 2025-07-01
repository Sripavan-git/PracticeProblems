package KnowBasicRecursion;
import java.util.*;

public class FinonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int N){

        // Base Condition.
        if(N <= 1){

            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);

        return last + slast;


    }
}
