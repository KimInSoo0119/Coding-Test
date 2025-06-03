import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {500, 100, 50, 10, 5, 1};
        long pay = 1000 - Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (pay >= arr[i]) {
                count += pay / arr[i];
                pay %= arr[i];
            }

            if (pay == 0) {
                System.out.print(count);
                break;
            }
        }
    }   
}