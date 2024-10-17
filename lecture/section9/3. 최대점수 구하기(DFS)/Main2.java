import java.util.Scanner;
// 정답 풀이
public class Main2 {
    static int n, m, answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > m) { // time <= m 조건 대신 return문을 추가
            return;
        }
        if (L == n) {
            answer = Math.max(sum, answer);
        } else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n]; // 문제별 점수와 제한시간을 별도 배열에 저장
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }

        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}