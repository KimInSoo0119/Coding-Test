import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        List<List<Integer>> tree = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }
        
        for(int j = 0; j < N - 1; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            tree.get(a).add(b);
            tree.get(b).add(a);
        }
        
        int[] parent = new int[N + 1];
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int node : tree.get(temp)) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    parent[node] = temp;
                }
            }
        }
        
        for(int k = 2; k <= N; k++) {
            System.out.println(parent[k]);
        }
     }
}