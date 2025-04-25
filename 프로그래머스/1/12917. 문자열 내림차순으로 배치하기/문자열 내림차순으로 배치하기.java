import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String s) {
        char[] strArr = s.toCharArray();
        String answer = "";
        List<String> upperList = new ArrayList<>();
        List<String> lowerList = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
          if (Character.isUpperCase(strArr[i])) {
            upperList.add(String.valueOf(strArr[i]));
          } else {
            lowerList.add(String.valueOf(strArr[i]));
          }
        }
        
        Collections.sort(upperList, Comparator.reverseOrder());
        Collections.sort(lowerList, Comparator.reverseOrder());
        
        for (String l : lowerList) {
          answer += l;
        }
        
        for (String u : upperList) {
          answer += u;
        }
        
        return answer;
    }
}