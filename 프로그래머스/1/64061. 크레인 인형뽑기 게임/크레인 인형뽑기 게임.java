import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stackList = new Stack<>();
        
        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i-1] != 0) {
                    if (stackList.isEmpty() == false && stackList.peek() == board[j][i-1]) {
                        stackList.remove(stackList.size() - 1);
                        board[j][i-1] = 0;
                        answer++;
                        break;
                    } else {
                        stackList.add(board[j][i-1]);
                        board[j][i-1] = 0;
                        break;   
                    }
                }
            }
        }
        answer *= 2;
        return answer;
    }
}