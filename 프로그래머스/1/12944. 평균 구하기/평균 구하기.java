class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        // return answer;
        
        if (1 <= arr.length && arr.length <= 100) {
            for (int i= 0; i < arr.length; i++) {
                answer += arr[i];
            }
            answer = answer / arr.length;
        }
        return answer;
    }
}