public class Solution {
  public int solution(int[] nums) {
    int answer = 0;
    
    for(int i = 0; i < nums.length - 2; i++) {
      for(int j = i + 1; j < nums.length - 1; j++) {
        for(int k = j + 1; k < nums.length; k++) {
          if (isPrime(nums[i] + nums[j] + nums[k])) {
            answer++;
          }
        }
      }
    }
    return answer;
  }
  
  public boolean isPrime(int num) {
    boolean result = true;
    
    for(int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        result = false;
      }
    }
    return result;
  }
}