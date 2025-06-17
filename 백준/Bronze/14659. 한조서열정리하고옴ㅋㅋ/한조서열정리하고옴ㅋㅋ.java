import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i = 0; i < N; i++) {
            int h = arr[i];
            int count = 0;
            for(int j = i + 1; j < N; j++) {
                if (h < arr[j]) {
                    break;
                } else {
                    count +=1;
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.print(answer);
    }
}