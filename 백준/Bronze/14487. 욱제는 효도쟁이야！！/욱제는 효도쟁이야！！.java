import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        int sum = 0;
        int max = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            max = Math.max(arr[i], max);
        }

        for(int j = 0; j < n; j++) {
            sum += arr[j];
        }

        sum -= max;
        System.out.print(sum);
    }    
}
