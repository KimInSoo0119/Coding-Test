import java.util.*;
class Solution {
  public String[] solution(String[] players, String[] callings) {
      String[] answer = players;
      HashMap<String, Integer> hashMap = new HashMap<>();
      
      for (int i = 0; i < players.length; i++) {
        hashMap.put(players[i], i);
      }
      
      for (int j = 0; j < callings.length; j++) {
        int val = hashMap.get(callings[j]);
        answer[val] = answer[val - 1];
        answer[val - 1] = callings[j];
        hashMap.put(callings[j], val - 1);
        hashMap.put(answer[val], val);
      }  
      return answer;
  }
}