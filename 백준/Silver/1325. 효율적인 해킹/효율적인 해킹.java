import java.io.*;
import java.util.*;
public class Main {
    static List<List<Integer>> arr;
    static int[] cntArr;
    static boolean[] visited;
    static int N, M;

    static void dfs(int start) {
        visited[start] = true;
        for(int next : arr.get(start)) {
            if(visited[next] == false) {
                cntArr[next]++;
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        cntArr = new int[N+1];

        arr = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
        }

        for(int i = 1; i <= N; i++) {
            visited = new boolean[N+1];
            dfs(i);
        }

        int max = 0;
        for(int i = 1; i <= N; i++) {
            max = Math.max(max, cntArr[i]);
        }

        for(int i = 1; i <= N; i++) {
            if(cntArr[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}