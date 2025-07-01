package KnowBasicRecursion;

/**
 * 1. Base Case - where the function stops calling itself
 * 2. Progress towards base case - like increment/decrement without it the recursion never ends.
 * Others - Stack Size Awareness, Avoid using global variables as it can be an issue in concurrency.
 */
public class PrintNtimes {
    static int cnt = 0;
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        if (cnt == 3)
            return;
        System.out.println(cnt);
        cnt += 1;
        print();
    }
}
