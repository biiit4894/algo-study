import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최소 힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a)); // 최대 힙
        
        for(String operation : operations) {
            String[] parts = operation.split(" ");
            String command = parts[0];
            int value = Integer.parseInt(parts[1]);
            
            if(command.equals("I")) {  // 삽입 연산
                minHeap.offer(value);
                maxHeap.offer(value);
            } else if(command.equals("D")) {  // 삭제 연산
                if(!minHeap.isEmpty()) {
                    if(value == 1) { // 최대값 삭제
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    } else if(value == -1) {
                        int min = minHeap.poll();
                        maxHeap.remove(min);
                    }
                }
            }
        }
        
        int[] answer = new int[2];
        if(!minHeap.isEmpty()) { // 큐가 비어있지 않은 경우
            answer[0] = maxHeap.poll(); // 최댓값
            answer[1] = minHeap.poll(); // 최솟값
        }
        return answer;
    }
}