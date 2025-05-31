//공원 가로길이 W, 공원 세로길이 H
//출발위치 SW, SH
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();
        int SH = 0;
        int SW = 0;
        
        for(int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                SW = park[i].indexOf("S");
                SH = i;
            }
        }

        for(int k = 0; k < routes.length; k++) {
            int NH = SH;
            int NW = SW;
            char direction = routes[k].charAt(0);
            int move = Character.getNumericValue(routes[k].charAt(2));
            for(int d = 0; d < move; d++) {
                if (direction == 'E') 
                    NW += 1;
                if (direction == 'W') 
                    NW -= 1;
                if (direction == 'S') 
                    NH += 1;
                if (direction == 'N')
                    NH -= 1;
                
                if (NH >= 0 && NW >= 0 && NH < H && NW < W) {
                    if (park[NH].charAt(NW) == 'X') {
                        break;
                    }            
                    if (d == move - 1) {
                        SW = NW;
                        SH = NH;
                    }
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = SH;
        answer[1] = SW;
        
        return answer;
    }
}