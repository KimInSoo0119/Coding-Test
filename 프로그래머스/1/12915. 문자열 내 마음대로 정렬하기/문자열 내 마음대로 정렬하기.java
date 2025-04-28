import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] result = new String[strings.length];
        List<String> listArr = new ArrayList<>();
        for(int i = 0; i < strings.length; i++) {
            listArr.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(listArr);
        
        for(int j = 0; j < listArr.size(); j++) {
            result[j] = listArr.get(j).substring(1);
        }
        
        return result;
    }
}