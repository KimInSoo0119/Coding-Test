import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // return answer;
        
        String[] strN = String.valueOf(n).split("");
        for (int i = 0; i < strN.length; i++) {
            answer += Integer.valueOf(strN[i]);
        }
        
        return answer;
    }
}