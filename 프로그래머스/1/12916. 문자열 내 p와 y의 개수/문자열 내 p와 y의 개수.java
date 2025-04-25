class Solution {
    boolean solution(String s) {
        // boolean answer = true;
        // return answer;
        int pCnt = 0;
        int yCnt = 0;
        String checkStr = s.toLowerCase();
        
        for (char c : checkStr.toCharArray()) {
            if (String.valueOf(c).equals("p")) {
                pCnt++;
            } else if (String.valueOf(c).equals("y")) {
                yCnt++;
            }
        }
        
        if ((pCnt == 0) && (yCnt == 0)) {
            return true;
        } else if (pCnt == yCnt) {
            return true;
        } else {
            return false;
        }
    }
}