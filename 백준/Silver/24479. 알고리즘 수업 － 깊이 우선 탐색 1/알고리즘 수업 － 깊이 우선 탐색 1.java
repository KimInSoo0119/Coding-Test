import java.util.*;
import java.io.*;
public class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int[] order;
    static int N, M, R, cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        R = Integer.parseInt(str[2]);

        graph = new ArrayList<>();
        visited = new boolean[N + 1];
        order = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        dfs(R);
        for(int i = 1; i <= N; i++) {
            System.out.println(order[i]);
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        order[start] = cnt++;

        for(int next : graph.get(start)) {
            if (visited[next] == false) {
                dfs(next);
            }
        }
    }
}