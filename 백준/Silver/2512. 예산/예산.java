import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        int target = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        
        int max = arr[arr.length - 1];
        binarySearch(arr, target, max);
    }
    
    static void binarySearch(int[] arr, int target, int max) {
        int st = 0;
        int en = max;
        int result = 0;
        
        while(st <= en) {
            int mid = (st + en) / 2;
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum += Math.min(arr[i], mid);
            }
            
            if (sum <= target) {
                result = mid;
                st = mid + 1;
            } else {
                en = mid - 1;
            } 
        }
        
        System.out.print(result);
    }
}