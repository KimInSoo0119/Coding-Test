import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr;
    static boolean[][] visited;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count = 0;
    static int answer;
    static List<Integer> arrList = new ArrayList<>();

    static void dfs(int x, int y) {
        visited[x][y] = true;
        answer += 1;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newY >= 0 && newX < n && newY < m) {
                if (arr[newX][newY] == 1 && visited[newX][newY] == false) {
                    dfs(newX, newY);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] str1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str1[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && visited[i][j] == false) {
                    answer = 0;
                    dfs(i, j);
                    arrList.add(answer);
                    count+=1;
                }
            }
        }
        if (arrList.size() == 0) {
            System.out.println(0);
            System.out.println(0);
        } else {
            Collections.sort(arrList, Collections.reverseOrder());
            System.out.println(count);
            System.out.println(arrList.get(0)); // 가장 큰 영역 크기
        }
    }
}