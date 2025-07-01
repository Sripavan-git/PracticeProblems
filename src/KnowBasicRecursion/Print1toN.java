package KnowBasicRecursion;
import java.util.Scanner;

public class Print1toN {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(1, n);
    }

    public static void print(int i, int n){
        if(i > n)
            return;
        System.out.print(i + " ");
        print(i+1, n);
    }

}
