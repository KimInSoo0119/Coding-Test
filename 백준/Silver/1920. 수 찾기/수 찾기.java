import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int[] arr = new int[M];
        int answer = 0;
        
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        };
        
        Arrays.sort(arr);
        int N = sc.nextInt();
        
        for(int j = 0; j < N; j++) {
            answer = binarySearch(arr, sc.nextInt());
            if (answer >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;
        
        while(st <= en) {
            int mid = (st + en) / 2;
            
            if (arr[mid] < target) {
                st = mid + 1;
            } else if (arr[mid] > target) {
                en = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}