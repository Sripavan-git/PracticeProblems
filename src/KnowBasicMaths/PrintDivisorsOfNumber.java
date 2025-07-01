package KnowBasicMaths;
import java.util.*;

public class PrintDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                divisors.add(i);
            }
        }
        System.out.println(divisors);
    }
}
