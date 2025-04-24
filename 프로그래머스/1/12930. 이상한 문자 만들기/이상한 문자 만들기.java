class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] str = s.split("");
        int idx = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
            }
            
            if (str[i].isBlank()) {
                idx = -1;
            }
            answer+=str[i];
            idx++;
        }
        return answer;
    }
  }