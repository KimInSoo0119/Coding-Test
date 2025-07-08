import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        
        int count = 1;
        for (int i = 1; i < N; i++) {
            int prev = Integer.parseInt(str[i - 1]);
            int cur  = Integer.parseInt(str[i]);
            if (prev <= cur) {
                count++;
            }
        }
        System.out.print(count);
    }
}
