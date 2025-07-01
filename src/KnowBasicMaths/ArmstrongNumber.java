package KnowBasicMaths;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(isArmstrongOrNot(n)){
            System.out.println(n + " is a Armstrong Number ");
        }else{
            System.out.println(n + " is not a Armstrong Number");
        }
    }

    public static boolean isArmstrongOrNot(int n){
        int k = String.valueOf(n).length();
        int sum = 0;
        int dup = n;

        while(n > 0){
            int last = n % 10;
            sum += (int) Math.pow(last, k);
            n = n/10;
        }
        return sum == dup;
    }
}
