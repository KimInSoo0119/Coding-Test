class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = 0;
        int max = 0;
        // return answer;
        
        if ((-10000000 <= a && a <= 10000000) && (-10000000 <= b && b <= 10000000)) {
            if (a != b) {
                if (a > b) {
                   max = a; 
                    min = b;
                } else {
                   min = a;
                    max = b;
                }
                for (int i = min; i < max + 1; i++) {
                    answer += i;
                }
            } else {
                answer = a;
            }
        }
        return answer;
    }
}