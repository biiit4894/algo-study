import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i % 5]) {
                answer[0]++;
            }
            if(answers[i] == two[i % 8]) {
                answer[1]++;
            }
            if(answers[i] == three[i % 10]) {
                answer[2]++;
            }
        }
        
        int[] max = Arrays.copyOfRange(answer, 0, 3);
        Arrays.sort(max);
        
        for(int i = 0; i < 3; i++) {
            if(answer[i] == max[2]) {
                ans.add(i + 1);
            }
        }
        
        int[] ret = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            ret[i] = ans.get(i);
        }
        return ret;
//         int maxScore = Math.max(num1, Math.max(num2, num3));
        
//         int[] nums = {num1, num2, num3};
//         Arrays.sort(nums);
        
//         for(int i = 0; i < 3; i++) {
//             if(answer[i])    
//         }
        
//         return nums[];
    }
}