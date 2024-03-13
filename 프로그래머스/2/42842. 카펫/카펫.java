import java.lang.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        // a : 카펫의 가로 - 2
        // b : 카펫의 세로 - 2
        int a = 0;
        int b = 0;
        
        for(a = yellow; a >= Math.sqrt(yellow); a--) {
            if(yellow % a == 0) {
                b = yellow / a;
                
                if((a + 2) * 2 + 2 * b == brown) {
                    break;
                }
            }
        }
        System.out.println(a + " " + b);
        
        answer[0] = a + 2;
        answer[1] = b + 2;
        
        return answer;
    }
}