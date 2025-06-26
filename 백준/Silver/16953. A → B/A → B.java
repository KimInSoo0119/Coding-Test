import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);

        int cnt = 0;
        while(a < b) {
            if (b % 10 == 1) {
                b /= 10;
            } else if (b % 2 == 0) {
                b /= 2;
            } else {
                break;
            }
            cnt+=1;
        }

        if (a == b) {
            System.out.print(++cnt);
        } else {
            System.out.print(-1);
        }
    }
}