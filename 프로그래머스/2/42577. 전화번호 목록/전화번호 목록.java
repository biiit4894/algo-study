// class Solution {
//     public boolean solution(String[] phone_book) {
//         // 시간초과
//         // 시간 복잡도 O(n^2)
//         // 만약에 길이가 1,000,000인 문자열 배열을 검사한다면, 총 비교 횟수는 약 10^12번
//         boolean answer = true;
//         for(int i = 0; i < phone_book.length; i++) {
//             for(int j = 0; j < phone_book.length; j++) {
//                 if(i != j && phone_book[j].contains(phone_book[i])) {
//                     answer = false;
//                     break;
//                 }
               
//             }
//         }
//         return answer;
//     }
// }
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 해시맵 생성
        HashMap<String, Boolean> map = new HashMap<>();
        
        // 전화번호부를 해시맵에 저장
        for (String phone : phone_book) {
            map.put(phone, true);
        }
        
        // 전화번호부를 다시 순회하면서 접두사인 경우가 있는지 확인
        for (String phone : phone_book) {
            // 현재 전화번호를 접두사로 사용하여 다른 전화번호를 확인
            for (int i = 0; i < phone.length(); i++) {
                String prefix = phone.substring(0, i); // 현재 전화번호의 접두사
                if (map.containsKey(prefix) && !prefix.equals(phone)) {
                    return false; // 접두사인 경우가 발견되면 false 반환
                }
            }
        }
        
        // 접두사인 경우가 없으면 true 반환
        return true;
        
    }
}