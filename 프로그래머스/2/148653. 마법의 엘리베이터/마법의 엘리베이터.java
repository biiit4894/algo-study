import java.util.*;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        
//         String str = storey + "";
//         int[] digits = new int[str.length()];
        
//         for(int i = 0; i < str.length(); i++) {
//             digits[i] = str.charAt(i) - '0';
//         }
        
//         if((storey % 10) == 0) {
//             answer = 1;
//         } else if(6 <= (storey % 10) <= 9) {
//             String num = "";
//             for(int i = 1; i < digits.length; i++) {
//                 num += (i + "");
//             }
//             answer = (digits[0] + 1) + (digits[0] * str.length()) ;
//         } else {
//             for(int digit : digits) {
//                 answer += digit;
//             }
//         }
        
        while(storey > 0) {
            int digit = storey % 10;
            storey /= 10;
            
            // 5인 경우, 앞자리 숫자가 5 이상이면 올려주는 것이 유리함
            if(digit == 5) {
                if(storey % 10 >= 5) {
                    answer += (10 - digit);
                    storey++;
                }
                else {
                    answer += digit;
                }
            }
            
            // 더하는 것이 이득
            else if(digit > 5) {
                answer += (10 - digit);
                storey++;
            } else {
                answer += digit;
            }
        }
        return answer;
    }
}