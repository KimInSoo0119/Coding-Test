import java.util.*;
import java.lang.*;
class Solution {
  public String solution(String X, String Y) {
      List<String> arr1 = new ArrayList<>(Arrays.asList(X.split("")));
      List<String> arr2 = new ArrayList<>(Arrays.asList(Y.split("")));
      List<String> arr3 = new ArrayList<>();
      Collections.sort(arr1);
      Collections.sort(arr2);
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < arr1.size(); i++) {
        if (arr2.contains(arr1.get(i))) {
          //arr3.add(arr1.get(i));
          sb.append(arr1.get(i));
          int idx = arr2.indexOf(arr1.get(i));
          arr2.remove(idx);
        }
      }
      
      int check = Integer.parseInt(sb.toString());
      
      if (check == 0) {
        return "0";
      } else if (check == 1) {
        return "1";
      } else {
        return sb.toString();
      }
  }
}