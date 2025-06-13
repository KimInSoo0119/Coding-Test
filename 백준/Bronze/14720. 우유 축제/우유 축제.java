import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int milk = 0;
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int k = Integer.parseInt(st.nextToken());

            if (k == milk) {
                milk = milk + 1 == 3 ? 0 : milk + 1;
                cnt += 1;
            }
        }

        System.out.print(cnt);
    }
}