class Solution {
    public String solution(int n) {
        String answer = "";
        // return answer;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        while (count < n / 2) {
            sb.append("수").append("박");
            count += 1;
        }
        
        if (n % 2 != 0) {
            sb.append("수");
        }
        
        answer = sb.toString();
        return answer;
    }
}