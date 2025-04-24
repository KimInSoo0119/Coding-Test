import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // return answer;
        
        if (Math.sqrt(n) % 1 == 0) {
            long num = (long)Math.sqrt(n);
            answer = (long)Math.pow((num + 1), 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}