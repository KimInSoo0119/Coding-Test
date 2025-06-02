import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] arr = new int[N];

        String[] str2 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        binarySearch(arr, max, M);
    }

    static void binarySearch(int[] arr, int max, int target) {
    int st = 0;
    int en = max;
    int result = 0;

    while(st <= en) {
        int mid = (st + en) / 2;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                sum += arr[i] - mid;
            }
        }

        if (sum >= target) {
            result = mid; 
            st = mid + 1; 
        } else {
            en = mid - 1; 
        }
    }

    System.out.print(result);
    }
}
