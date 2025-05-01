class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String currentLeft = "*";
        String currentRight = "#";
        int idx = -1;
        int origin1 = -1;
        int origin2 = -1;
        int left1 = -1;
        int left2 = -1;
        int right1 = -1;
        int right2 = -1;
        int diffLeft = 0;
        int diffRight = 0;
        
        String[][] strArr = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};
        
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                currentLeft = String.valueOf(numbers[i]);
                answer += "L";
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                currentRight = String.valueOf(numbers[i]);
                answer += "R";
            } else {;
                for (int j = 0; j < strArr.length; j++) {
                    for (int k = 0; k < strArr[j].length; k++) {
                        if (String.valueOf(numbers[i]).equals(strArr[j][k])) {
                            origin1 = j;
                            origin2 = k;
                        }
                        if (currentLeft.equals(strArr[j][k])) {
                            left1 = j;
                            left2 = k;
                        }
                        if (currentRight.equals(strArr[j][k])) {
                            right1 = j;
                            right2 = k;
                        }
                    }
                }   
                diffLeft = Math.abs(origin1 - left1) + Math.abs(origin2 - left2);
                diffRight = Math.abs(origin1 - right1) + Math.abs(origin2 - right2);
                
                if (diffLeft > diffRight) {
                    currentRight = strArr[origin1][origin2];
                    answer += "R";
                } else if (diffLeft < diffRight) {
                    currentLeft = strArr[origin1][origin2];
                    answer += "L";
                } else {
                    if (hand.equals("right")) {
                        currentRight = strArr[origin1][origin2];
                        answer += "R";
                    } else {
                        currentLeft = strArr[origin1][origin2];
                        answer += "L";
                    }
                }
            }
        }
        return answer;
    }
}