import java.util.Scanner;
// 나의 풀이
public class Main {
    static int n, m, answer = Integer.MIN_VALUE;
    public void DFS(int L, int score, int time, int[][] arr) {
        if(L == n) {
            if (time <= m) {
                answer = Math.max(answer, score);
            }
        } else {
            DFS(L + 1, score + arr[L][0], time + arr[L][1], arr);
            DFS(L + 1, score, time, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 문제의 개수
        m = kb.nextInt(); // 제한시간
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt(); // 점수
            arr[i][1] = kb.nextInt(); // 시간
        }
        T.DFS(0, 0, 0, arr);
        System.out.println(answer);
    }
}