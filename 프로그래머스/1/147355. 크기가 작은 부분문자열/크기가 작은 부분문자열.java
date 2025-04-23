import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long lp = Long.parseLong(p);
        
        for (int i = 0; i + size <= t.length(); i++) {
          String subStr = t.substring(i, i + size);
          if (Long.parseLong(subStr.toString()) <= lp) {
              answer++;
          } else {
              continue;
          }
        }
        return answer;
    }
}