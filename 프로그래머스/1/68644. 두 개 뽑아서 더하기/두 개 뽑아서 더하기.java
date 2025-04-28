import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int value = 0;
        List<Integer> listArr = new ArrayList<Integer>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                value = numbers[i] + numbers[j];
                if (!listArr.contains(value)) {
                    listArr.add(value);
                }
            }
         }
        
        Collections.sort(listArr);
        int[] answer = new int[listArr.size()];
        for(int t = 0; t < listArr.size(); t++) {
            answer[t] = listArr.get(t);    
        }
        
        return answer;
    }
}