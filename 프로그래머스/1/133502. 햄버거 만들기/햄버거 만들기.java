import java.util.*;
class Solution {
  public int solution(int[] ingredient) {
      int answer = 0;
      List<Integer> arrList = new ArrayList<>();
      
      for (int i = 0; i < ingredient.length; i++) {
        arrList.add(ingredient[i]);
        if (arrList.size() >= 4) {
          if (arrList.get(arrList.size() - 4) == 1 && arrList.get(arrList.size() - 3) == 2
              && arrList.get(arrList.size() - 2) == 3 && arrList.get(arrList.size() - 1) == 1) {
            arrList.remove(arrList.size() - 1);
            arrList.remove(arrList.size() - 1);
            arrList.remove(arrList.size() - 1);
            arrList.remove(arrList.size() - 1);
            answer++;
          }
        }
      }
      return answer;
  }
}