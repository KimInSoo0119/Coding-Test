import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {300, 60, 10};

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            if (T >= arr[i]) {
                int val = T / arr[i];
                sb.append(val).append(' ');
                T %= arr[i];
            } else {
                sb.append(0).append(' ');
            }
        }

        if (T != 0) {
            System.out.print(-1);
        } else {
            System.out.print(sb.toString());
        }
    }
}