import java.util.PriorityQueue;
import java.lang.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int s : scoville) {
            minHeap.add(s);
        }
        
        while(minHeap.peek() < K) {
            if(minHeap.size() <= 1) {
                return -1;
            } else {
                int first = minHeap.poll();
                int second = minHeap.poll();
                int mixed = first + second * 2;
                minHeap.add(mixed);
                answer++;
            }

        }
        return answer;
    }
}