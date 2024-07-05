import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int bIdx = B.length - 1;
        for(int num : A) {
            answer += num * B[bIdx--];
        }
        return answer;
    }
}