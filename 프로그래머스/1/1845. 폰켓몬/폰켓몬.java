import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int limit = nums.length / 2;

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for (int i : nums) {
                 if (hashMap.containsValue(i)) {
                    continue;
                } else {
                     answer += 1;
                    hashMap.put(answer, i);
                }
            
            if (answer == limit) {
                return answer;
            }
        }
        return answer;
    }
}