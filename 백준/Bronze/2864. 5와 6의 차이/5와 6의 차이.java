import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        String a = str[0];
        String b = str[1];

        String sA = a.replaceAll("6", "5");
        String sB = b.replaceAll("6", "5");

        String bA = a.replaceAll("5", "6");
        String bB = b.replaceAll("5", "6");

        long results = Long.parseLong(sA) + Long.parseLong(sB);
        long resultb = Long.parseLong(bA) + Long.parseLong(bB);

        System.out.print(results + " ");
        System.out.print(resultb);
    }
}