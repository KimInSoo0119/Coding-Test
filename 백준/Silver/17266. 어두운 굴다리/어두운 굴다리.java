import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[M];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);
        binarySearch(N, arr);
    }

    static void binarySearch(int N, int[] arr) {
        int st = 1;
        int en = N;
        int result = 0;

        while(st <= en)  {
            int mid = (st + en) / 2;

            if (check(arr, mid, N)) {
                result = mid;
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        System.out.print(result);
    }

    static boolean check(int[] arr, int mid, int N) {
        int last = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] - last > mid) {
                return false;
            }
            last = arr[i] + mid;
        }

        return last >= N;
    }
}