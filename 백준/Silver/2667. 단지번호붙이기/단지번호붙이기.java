import java.util.*;
import java.io.*;
public class Main {
    final static int MAX = 25 + 10;
    static boolean[][] arr;
    static boolean[][] visited;
    static int count;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    
    static void dfs(int y, int x) {
        visited[y][x] = true;
        count++;
        
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if (!visited[newY][newX] && arr[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        // 1. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            String s = br.readLine();
            for(int j = 1; j <= N; j++) {
                arr[i][j] = s.charAt(j - 1) == '1';
            }
        }
        // 2. (1,1) (n,n) 까지 dfs
        List<Integer> countList = new ArrayList<Integer>();
        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    countList.add(count);
                } 
            }
        }
        // 3. 출력
        System.out.println(countList.size());
        Collections.sort(countList);
        for (int i = 0; i < countList.size(); i++) {
            System.out.println(countList.get(i));
        }
    }
}