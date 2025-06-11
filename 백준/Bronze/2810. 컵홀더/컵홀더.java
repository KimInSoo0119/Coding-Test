import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        String s = "";
        for(int i = 0; i < N; i++) {
            if (str.charAt(i) == 'S') {
                s += "*S";
            } else {
                s += "*LL";
                i++;
            }
        }
        s += "*";

        int count = 0;
        for(int j = 0; j < s.length(); j++) {
            if (String.valueOf(s.charAt(j)).equals("*")) {
                count++;
            }
        }

        if (N <= count) {
            System.out.print(N);
        } else {
            System.out.print(count);
        }
            
    }
}