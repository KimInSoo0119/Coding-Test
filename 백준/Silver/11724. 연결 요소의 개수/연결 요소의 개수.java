import java.io.*;
public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        //정점의 개수 N, 간선의 개수 M
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        arr = new int[1001][1001];
        visited = new boolean[1001];

        for(int i = 0; i < M; i++) {
            String[] str2 = br.readLine().split(" ");
            int a = Integer.parseInt(str2[0]);
            int b = Integer.parseInt(str2[1]);

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (visited[i] == false) {
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }

    static void dfs(int index) {
        if (visited[index] == true) {
            return;
        } else {
            visited[index] = true;
            for(int i = 1; i <= N; i++) {
                if (arr[index][i] == 1) {
                    dfs(i);
                }
            }
        }
    }
}