import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
// 나의 풀이
public class SavingPrincess {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while(queue.size() > 1) {
            for (int j = 0; j < k - 1; j++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        answer = queue.element();
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        SavingPrincess T = new SavingPrincess();
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}