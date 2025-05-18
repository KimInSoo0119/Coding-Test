import java.util.*;
class Solution {
  public int[] solution(String[] keymap, String[] targets) {
      int[] answer = new int[targets.length];
      HashMap<Character, Integer> hashMap = new HashMap<>();
      
      for(String s : keymap) {
          for (int i = 0; i < s.length(); i++) {
              char ch = s.charAt(i);
              int idx = hashMap.getOrDefault(ch, i + 1);
              
              hashMap.put(ch, Math.min(idx, i + 1));
          }
      }
                          
      for (int k = 0; k < targets.length; k++) {
          for (int m = 0; m < targets[k].length(); m++) {
              if (hashMap.containsKey(targets[k].charAt(m))) {
                  answer[k] += hashMap.get(targets[k].charAt(m));
              } else {
                  answer[k] = -1;
                  break;
              }
          }
      }
      
      return answer;
  }
}