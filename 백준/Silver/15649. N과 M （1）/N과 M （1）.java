import java.io.*;
public class Main {
    
    static int[] arr;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        
        arr = new int[M];
        visited = new boolean[N];
        
        dfs(N, M, 0);
    }
    
    static void dfs(int N, int M, int depth) {
        
        if(depth == M) {
            for(int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        
        for(int i = 0; i < N; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visited[i] = false;
            }
        }
    }
}