class Solution {
  public String solution(String s, String skip, int index) {
      String answer = "";
      char[] ch = s.toCharArray();
      for (int i = 0; i < ch.length; i++) {
        int count = 1;
        while (count <= index) {
          if (ch[i] == 'z') {
            ch[i] = 'a';
          } else {
            ch[i]++;
          }
          
          if (!skip.contains(String.valueOf(ch[i]))) {
            count++;
          }
        }
        answer+=ch[i];
      }
      return answer;
  }
}