class Solution {
    public int[] solution(int n, int m) {
        // int[] answer = {};
        // return answer;
        
        int gcd = getGCD(m, n);
        int lcm = n * m / gcd;
        
        int[] answer = {gcd, lcm};
        return answer;
    }
    
    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}