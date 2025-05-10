import java.util.*;
import java.lang.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arrc1 = new String[arr1.length];
        String[] arrc2 = new String[arr2.length];
        
        arrc1 = convert(arr1, n);
        arrc2 = convert(arr2, n);

        for (int k = 0; k < n; k++) {
            StringBuilder sbs = new StringBuilder();
            String sum = "";
            
            for (int a = 0; a < arrc1[k].length(); a++) {
                int cnt = Integer.valueOf(String.valueOf(arrc1[k].charAt(a))) + Integer.valueOf(String.valueOf(arrc2[k].charAt(a)));
                sbs.append(cnt);
            }
            sum = sbs.toString();
            sum = sum.replace('0', ' ');
            sum = sum.replace('1', '#');
            sum = sum.replace('2', '#');
            
            answer[k] = sum;
        }
        
            
        return answer;
    }
    
    public String[] convert(int[] arr, int n) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            while (arr[i] != 0) {
                int value = arr[i] % 2;
                sb.append(value);   
                arr[i] /= 2;
            }
            if (sb.length() < n) {
                int diff = n - sb.length();
                for (int j = 1; j <= diff; j++) {
                    sb.append(0);
                }
            }
            result[i] = sb.reverse().toString();
        }
        return result;
    }
}