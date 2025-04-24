import java.lang.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        // return answer;
        
        StringBuilder sb = new StringBuilder(s);
        int idx = s.length() / 2;
        
        if (s.length() % 2 == 0) {
            answer = sb.substring(idx - 1, idx + 1);
        } else {
            answer = String.valueOf(sb.charAt(idx));
        }
        
        return answer;
    }
}