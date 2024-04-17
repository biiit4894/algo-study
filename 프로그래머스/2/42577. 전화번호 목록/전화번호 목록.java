import java.util.Arrays;
import java.lang.System;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phone_book);
        
        // 2. 1중 Loop를 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}