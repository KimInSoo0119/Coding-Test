class Solution {
    public int solution(int[] a, int[] b) {
        int count = 0;
        int answer = 0; 
        // return answer;
        
        int size = a.length;
        for (int i = 0; i < a.length; i++) {
            answer = a[i] * b[i];
            count += answer;
        }
        
        return count;
    }
}