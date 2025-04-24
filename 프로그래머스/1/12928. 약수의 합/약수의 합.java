class Solution {
    public int solution(int n) {
        int answer = 0;
        // return answer;
        
        for (int i = 1; i <= n; i++) {
           if (n % i == 0) {
               answer += i;
           } 
        }
        return answer;
    }
}