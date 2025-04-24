import java.util.*;
import java.lang.*;

class Solution {
    public long solution(long n) {
        // long answer = 0;
        // return answer;
        StringBuilder sb = new StringBuilder();

        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);

        for (int i = strArr.length - 1; i > -1; i--) {
          sb.append(strArr[i]);
        }

        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}