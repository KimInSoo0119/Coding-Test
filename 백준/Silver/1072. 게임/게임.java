import java.io.*;

public class Main {
    static long x, y, z;
    static long answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        x = Long.parseLong(str[0]);
        y = Long.parseLong(str[1]);
        z = (y * 100) / x;

        if (z >= 99) {
            System.out.print(-1);
            return;
        }

        long left = 0;
        long right = 1_000_000_000;
        binarySearch(left, right);
    }

    static void binarySearch(long left, long right) {
        long answer = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long newZ = ((y + mid) * 100) / (x + mid);

            if (newZ > z) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.print(answer);
    }
}
