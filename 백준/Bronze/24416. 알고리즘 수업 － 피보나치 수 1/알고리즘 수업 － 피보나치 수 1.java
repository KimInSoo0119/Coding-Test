import java.util.*;
import java.io.*;
public class Main {
    static int count1, count2;
    static int[] memo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        count1 = 0;
        count2 = 0;
        memo = new int[n];
        br.close();
 
        fib(n);
        fibonacci(n);
        System.out.println(count1 + " " + count2);
    }
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static int fibonacci(int n) {
        memo[0] = 1;
        memo[1] = 1;
 
        for(int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
            count2++;
        }
        return memo[n - 1];     
    }
}