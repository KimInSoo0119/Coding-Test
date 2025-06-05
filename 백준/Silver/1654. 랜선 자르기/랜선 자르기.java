import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int K = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);

        int[] arr = new int[K];
        for(int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        binarySearch(arr, max, N);
    }

    static void binarySearch(int[] arr, int max, int N) {
        long st = 1;
        long en = max;
        long result = 0;

        while(st <= en) {
            long mid = (st + en) / 2;
            long sum = 0;

            for(int i = 0; i < arr.length; i++) {
                sum += arr[i] / mid;
            }

            if (sum >= N) {
                result = mid;
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }

        System.out.println(result);
    }
}