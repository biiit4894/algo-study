import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        
        int[] digits = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        
        for(int i : digits) {
            answer += i;
        }

        return answer;
    }
}