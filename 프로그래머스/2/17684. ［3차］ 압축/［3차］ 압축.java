import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();;
        
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= 26; i++) {
            map.put(Character.toString((i + 64)), i);
        }
        
        int i = 0;
        int lastIdx = 26;
        while(i < msg.length()) {
            int j = 0;

            String str = "";
            while(i + j < msg.length() && map.containsKey(msg.substring(i, i + j + 1))) {
                str = msg.substring(i, i + j + 1);
                j++;
            }
            
            answer.add(map.get(str));
            
            if(i + j < msg.length()) {
                String newStr = str + msg.charAt(i + j);
                lastIdx++;
                map.put(newStr, lastIdx);
            }
            
            i += str.length();
        }
        
        return answer;
    }
}