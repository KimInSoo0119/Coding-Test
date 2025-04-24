import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] str = s.split("");
        
        for (int i = 0; i < str.length; i++) {
          if (str[i].isBlank() == false) {
              char tmp = str[i].charAt(0);
              int temp = (int)str[i].charAt(0) + n;
              if (Character.isUpperCase(tmp) == false) {
                if (temp > 122) {
                  int over = temp - 122;
                  temp = 96 + over;
                }
              } else {
                 if (temp > 90) {
                  int over = temp - 90;
                  temp = 64 + over;
                 } 
              }
              str[i] = String.valueOf((char)temp);
          }
        }
        for (String v : str) {
            answer += v;
        }
        
        char cc = 'A';
        char aa = 'Z';
        char c = 'a';
        char a = 'z';
        System.out.println((int)cc);
        System.out.println((int)aa);
        System.out.println((int)c);
        System.out.println((int)a);
        return answer;
    }
}