import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            String[] str = br.readLine().split(" ");

            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[] arr1 = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr1);

            st = new StringTokenizer(br.readLine());
            int answer = 0;
            for(int i = 0; i < M; i++) {
                int val = Integer.parseInt(st.nextToken());
                answer += binarySearch(arr1, val);
            }

            System.out.println(answer);
        }
    }

    static int binarySearch(int[] arr, int val) {
        int st = 0;
        int en = arr.length - 1;
        int cnt = 0;

        while(st <= en) {
            int mid = (st + en) / 2;

            if (arr[mid] > val) {
                en = mid - 1;
                cnt = arr.length - mid;
            } else {
                st = mid + 1;
            }
        }
        return cnt;
    }
}