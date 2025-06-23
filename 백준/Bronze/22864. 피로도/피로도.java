import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);
        int M = Integer.parseInt(arr[3]);

        int cnt = 0; //시간
        int tmp = 0; //피로도
        int sum = 0; //일
        while(cnt < 24) {
            if (A + tmp <= M) {
                tmp += A;
                sum += B;
            } else {
                tmp -= C;
                if (tmp < 0) {
                    tmp = 0;
                }
            }
            cnt++;
        }

        System.out.print(sum);
    }
}