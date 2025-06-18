import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for(int k = 0; k < M; k++) {
                int answer = binarySearch(arr, Integer.parseInt(st.nextToken()));
                sb.append(answer > -1 ? 1 : 0).append("\n");
            }
        }
        System.out.print(sb);
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