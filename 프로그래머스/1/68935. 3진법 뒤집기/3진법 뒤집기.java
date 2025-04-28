import java.lang.*;
class Solution {
    public int solution(int n) {
        String convert = "";
        int convertTen = -1;
        
        convert = conversion(n, 3);
        convertTen = conversion_ten(convert, 3);
        
        return convertTen;
    }
    
    public String conversion(int number, int N) {
        int current = number;
        StringBuilder sb = new StringBuilder();
        
        while (current > 0) {
            if (current % N < 10) {
                sb.append(current % N);
            } else {
                sb.append(current % N - 10 + 'A');
            }
            current /= N;
        }
        
        return sb.toString();
    }
    
    public int conversion_ten(String number, int N) {
        char[] nums = number.toCharArray();
        int ans = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 'A') {
                ans = ans * N + (nums[i] - 'A' + 10);
            } else {
                ans = ans * N + (nums[i] - '0');
            }
        }
        
        return ans;
    }
}