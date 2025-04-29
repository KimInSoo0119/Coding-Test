

class Solution {
  public boolean solution(int x) {
      boolean answer = false;
      int sum = 0;
      
      String[] strArr = String.valueOf(x).split("");
      
      for(int i = 0; i < strArr.length; i++) {
        sum += Integer.valueOf(strArr[i]);
      }
      
      if (x % sum == 0) {
        answer = true;
      } else {
        answer = false;
      }
      
      return answer;
  }
}