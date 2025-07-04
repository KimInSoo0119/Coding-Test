import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
        }

        int[] distant = new int[n + 1];
        Arrays.fill(distant, -1);
        distant[x] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int next : graph.get(current)) {
                if (distant[next] == -1) {
                    distant[next] = distant[current] + 1;
                    queue.add(next);
                }
            }
        }

        boolean found = false;
        for(int i = 1; i <= n; i++) {
            if (distant[i] == k) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.print(-1);
        }
    }
}