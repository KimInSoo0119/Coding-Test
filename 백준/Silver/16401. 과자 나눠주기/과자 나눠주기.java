import java.io.*;
public class Main {
    static int[] arr;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        arr = new int[M];
        String[] str1 = br.readLine().split(" ");

        int max = 0;
        for(int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(str1[i]);
            max = Math.max(arr[i], max);
        }

        binarySearch(max);
    }

    static void binarySearch(int max) {
        int st = 1;
        int en = max;
        int result = 0;
        while(st <= en) {
            int mid = (st + en) / 2;

            int count = 0;
            for(int val : arr) {
                count += (val / mid);
            }

            if (count >= N) {
                st = mid + 1;
                result = mid;
            } else {
                en = mid - 1;
            }
        }
        System.out.print(result);
    }
}