import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < M; j++) {
            int target = sc.nextInt();
            int lower = lowerBound(arr, target);
            int upper = upperBound(arr, target);
            sb.append(upper - lower).append(' ');
        }
        System.out.print(sb);
    }
    
    static int lowerBound(int[] arr, int target) {
        int st = 0;
        int en = arr.length;
        
        while(st < en) {
            int mid = (st + en) / 2;
            
            if (target <= arr[mid]) {
                en = mid;
            } else {
                st = mid + 1;
            }
        }
        return en;
    }
    
    static int upperBound(int[] arr, int target) {
        int st = 0;
        int en = arr.length;
        
        while(st < en) {
            int mid = (st + en) / 2;
            
            if (target < arr[mid]) {
                en = mid;
            } else {
                st = mid + 1;
            }
        }
        return en;
    }
}