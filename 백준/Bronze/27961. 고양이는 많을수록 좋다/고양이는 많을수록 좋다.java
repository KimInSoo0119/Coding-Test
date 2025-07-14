import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if (N == 0) {
            System.out.print(0);
            return;
        }

        long cnt = 1;
        long sum = 1;
        while (sum < N) {
            sum *= 2;
            cnt++;
        }

        System.out.print(cnt);

    }

}