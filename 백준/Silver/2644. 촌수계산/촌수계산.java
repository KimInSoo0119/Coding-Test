//전체 사람 수 N
//촌수를 계산해야하는 서로 다른 두사람 번호
import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr;
    static int[] visited;
    static int N, start, end, m;
    static void dfs(int start) {
        if (start == end) {
            return;
        }

        for (int i = 1; i <= N; i++) {
            if(arr[start][i] == 1 && visited[i] == 0) {
                visited[i] = visited[start] + 1;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][N+1];
        visited = new int[N+1];

        String[] str = br.readLine().split(" ");
        start = Integer.parseInt(str[0]);
        end = Integer.parseInt(str[1]);
    
        m = Integer.parseInt(br.readLine());
    
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        dfs(start);
        System.out.println(visited[end] == 0 ? -1 : visited[end]);

}
}