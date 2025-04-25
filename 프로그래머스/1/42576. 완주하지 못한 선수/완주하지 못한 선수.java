import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //return answer;
        
        HashMap<String, Integer> mapInfo = new HashMap<>();
        
        for (int i = 0; i < participant.length; i++) {
          if(mapInfo.get(participant[i]) != null) {
            mapInfo.put(participant[i], mapInfo.get(participant[i]) + 1);
          } else {
            mapInfo.put(participant[i], 1);
          }
        }
        
        for(int j = 0; j < completion.length; j++) {
          if(mapInfo.get(completion[j]) != null) {
            int value = mapInfo.get(completion[j]);
            mapInfo.remove(completion[j]);
            mapInfo.put(completion[j], value - 1);
          }
        }
        
        for (String s : mapInfo.keySet()) {
          if (mapInfo.get(s) > 0) {
              answer = s;
          }
        }
        
        return answer;
    }
}