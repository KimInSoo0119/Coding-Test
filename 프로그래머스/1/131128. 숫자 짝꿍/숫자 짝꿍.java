import java.util.*;
import java.lang.*;
class Solution {
  public String solution(String X, String Y) {
      HashMap<Integer, Integer> map1 = new HashMap<>();
      HashMap<Integer, Integer> map2 = new HashMap<>();
      StringBuilder sb = new StringBuilder();
      
      String[] X1 = X.split("");
      String[] Y1 = Y.split("");
          
      for (String s : X1) {
          map1.put(Integer.parseInt(s), map1.getOrDefault(Integer.parseInt(s), 0) + 1);
      }
      
      for (String s : Y1) {
          map2.put(Integer.parseInt(s), map2.getOrDefault(Integer.parseInt(s), 0) + 1);
      }
       
      for (int i = 9; i >= 0; i--) {
          if (map1.containsKey(i) == true && map2.containsKey(i) == true) {
              int cnt = Math.min(map1.get(i), map2.get(i));
              for (int j = 0; j < cnt; j++) {
                  sb.append(i);
              }
          }
      }
      
      if (sb.toString().length() == 0) {
          return "-1";
      }
      
      if (sb.toString().replace("0", "").length() == 0) {
          return "0";
      }
      
      return sb.toString();
  }
}