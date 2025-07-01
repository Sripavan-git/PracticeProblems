package KnowBasicMaths;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverseNum = 0;
        while(n>0){
            int last = n % 10;
            reverseNum = (reverseNum * 10) + last;
            n = n/10;
        }

        System.out.println(reverseNum);
    }
}
