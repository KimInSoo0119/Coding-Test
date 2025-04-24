import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        // int[] answer = {};
        // return answer;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            } else {
                stack.push(arr[i]);
            }
        }
        return stack;
        
    }
}