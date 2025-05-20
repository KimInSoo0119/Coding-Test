import java.util.*;
class Solution {
  public int solution(String[] babbling) {
      int answer = 0;
      String[] voice = {"aya", "ye", "woo", "ma"};
      
      for(int i = 0; i < babbling.length; i++) {
        for(int j = 0; j < voice.length; j++) {
          if (babbling[i].contains(voice[j] + voice[j]) == true) {
            break;
          } else if (babbling[i].indexOf(voice[j]) != -1) {
            babbling[i] = babbling[i].replace(voice[j], " ");
          }
        }
        System.out.println(babbling[i]);
        if (babbling[i].trim().length() == 0) {
          answer++;
        }
      }
      return answer;
  }
}