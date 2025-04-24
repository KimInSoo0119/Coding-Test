import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        // int[] answer = {};
        ArrayList<Integer> arrs = new ArrayList<Integer>();
        // return answer;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrs.add(arr[i]); 
            } 
        }
        
        if (arrs.size() == 0) {
            arrs.add(-1);
        }
        
        arrs.sort(Comparator.naturalOrder());
        return arrs;
    }
}