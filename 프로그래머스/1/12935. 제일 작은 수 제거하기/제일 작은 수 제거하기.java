import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            arr[0] = -1;
            
            return arr;
        } else {
            List<Integer> arrList = new ArrayList<>();
            
            for (int i : arr) {
                arrList.add(i);
            }
        
            Integer min = Collections.min(arrList);
            arrList.remove(min);
            // Collections.sort(arrList, Collections.reverseOrder());
            
            int[] resultArr = new int[arr.length - 1];
            for (int i = 0; i < arrList.size(); i++) {
                resultArr[i] = arrList.get(i).intValue();
            }
            return resultArr;
        }
    }
}