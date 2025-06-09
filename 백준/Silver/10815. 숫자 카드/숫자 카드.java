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
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");
        for(int j = 0; j < M; j++) {
            int answer = binarySearch(arr, Integer.parseInt(str2[j]));
            if (answer > -1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }

    static int binarySearch(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;

        while(st <= en) {
            int mid = (st + en) / 2;

            if (arr[mid] < target) {
                st = mid + 1;
            } else if (arr[mid] > target) {
                en = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}