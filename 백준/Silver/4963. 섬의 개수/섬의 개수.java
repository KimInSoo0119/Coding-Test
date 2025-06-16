import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0, 1, -1, 1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, -1, 1};
    static int w,h;
    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i = 0; i < 8; i++) {
            int newY = dy[i] + y;
            int newX = dx[i] + x;

             if (newX < 0 || newY < 0 || newX >= h || newY >= w) continue;
                if (arr[newX][newY] == 1 && !visited[newX][newY]) {
                    dfs(newX, newY);
                }

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            arr = new int[h][w];
            visited = new boolean[h][w];

            for(int i = 0; i < arr.length; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}