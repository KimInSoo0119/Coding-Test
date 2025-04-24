class Solution {
  public String solution(String[] seoul) {
      String key = "";

      for (int i = 0; i < seoul.length; i++) {
        if (seoul[i].equals("Kim")) {
          key = String.valueOf(i);
          break;
        }
      }

      String answer = "김서방은 " + key + "에 있다";
      return answer; 
  }
}