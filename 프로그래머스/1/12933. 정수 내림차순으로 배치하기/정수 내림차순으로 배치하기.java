import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        
        Character[] arr = new Character[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sortedStr = new StringBuilder(arr.length);
        
        for(char c : arr) {
            sortedStr.append(c);
        }
        
        return Long.parseLong(sortedStr.toString());
    }
}