import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num); // 중복된 값 제가
        }
        
        int answer = nums.length / 2 > set.size() ? set.size() : nums.length / 2;
        // 선택할 수 있는 최대 폰켓몬 종류의 수
        // 중복 제거한 후의 폰켓몬 종류의 수
        // 둘 중 작은 값을 answer 변수에 저장 -> 선택할 수 있는 최대 폰켓몬 종류의 수가 저장됨
        return answer;
    }
}