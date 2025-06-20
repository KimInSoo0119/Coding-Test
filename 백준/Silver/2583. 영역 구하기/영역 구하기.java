import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr;
    static int count = 0;
    static int M, N, K;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static void dfs (int x, int y) {
        arr[x][y] = 1;
        count += 1;
        for(int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newY >= 0 && newX < M && newY < N) {
                if (arr[newX][newY] == 0) {
                    arr[newX][newY] = 1;
                    dfs(newX, newY);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        M = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);
        K = Integer.parseInt(str[2]);

        arr = new int[M][N];

        for(int i = 0; i < K; i++) {
            String[] str1 = br.readLine().split(" ");
            int st1 = Integer.parseInt(str1[1]);
            int en1 = Integer.parseInt(str1[3]);
            int st2 = Integer.parseInt(str1[0]);
            int en2 = Integer.parseInt(str1[2]);

            for(int a = st1; a < en1; a++) {
                for(int b = st2; b < en2; b++) {
                    arr[a][b] = 1;
                }
            }
        }

        List<Integer> arrList = new ArrayList<>();
        for(int l = 0; l < arr.length; l++) {
            for(int m = 0; m < arr[l].length; m++) {
                if (arr[l][m] == 0) {
                    count = 0;
                    dfs(l, m);
                    arrList.add(count);
                }
            }
        }

        Collections.sort(arrList);
        System.out.println(arrList.size());
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}