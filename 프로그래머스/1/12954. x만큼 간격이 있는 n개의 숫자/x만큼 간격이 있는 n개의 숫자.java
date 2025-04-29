class Solution {
  public long[] solution(int x, int n) {
      long[] answer = new long[n];
      long i = 1;
      int idx = 0;
      
      while(i <= n) {
        long value = i * x;
        answer[idx] = value;
        idx++;
        i++;
      }
      
      return answer;
  }
}