import java.util.*;
class Solution {
  public int solution(int number, int limit, int power) {
      int answer = 0;
      //return answer;
      for (int i = 0; i <= number; i++) {
        int divCnt = count(i) ;
        answer += divCnt > limit ? power : divCnt;
      }
      return answer;
  }
  public int count(int num) {
    int divCnt = 0;
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        divCnt++;
        if (i != num/i) {
          divCnt++;
        }
      } else {
        continue;
      }
    }
    return divCnt;
  }
}