import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int count = 0;
        int[] coins = new int[N];
        
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        
        for (int m = coins.length - 1; m >= 0; m--) {
            if (coins[m] <= K) {
                count += K / coins[m];
                K %= coins[m];
            }
            
            if (K == 0) {
                break;
            }
        }
        
        System.out.println(count);
    }
}