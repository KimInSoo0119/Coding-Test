import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] money = {25, 10, 5, 1};

        for(int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            int c = Integer.parseInt(br.readLine());

            for(int j = 0; j < money.length; j++) {
                int cnt = c / money[j];
                sb.append(cnt).append(' ');
                c %= money[j];
            }
            System.out.println(sb.toString());
        }
    }
}