import java.io.*;
import java.util.*;

public class Main {
  
  static int[][] arr;
  static boolean[] visited;
  static int result = 0;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    
    arr = new int[a + 1][a + 1];
    
    for (int i = 0; i < b; i++) {
      String[] str = br.readLine().split(" ");
      
      int c = Integer.valueOf(str[0]);
      int d = Integer.valueOf(str[1]);
      
      arr[c][d] = 1;
      arr[d][c] = 1;
    }
    
    visited = new boolean[a + 1];
    bfs(1);
    
    System.out.print(result);
  }
  
  static void bfs(int V) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(V);
    visited[V] = true;
    
    while(!queue.isEmpty()) {
      int temp = queue.poll();
      for (int node = 1; node < arr.length; node++) {
        if (arr[temp][node] == 1 && visited[node] == false) {
          visited[node] = true;
          queue.add(node);
          result++;
        }
      }
    }
  }
}