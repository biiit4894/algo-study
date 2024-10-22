import java.util.Scanner;
// 정답 풀이
public class Main {

    static int[] b, p, ch;
    // b : 이항 계수 값을 미리 계산해서 저장.
    // 나중에 순열을 구성할 때 그 자리에 곱해질 가중치 역할을 함

    // p : 현재 순열을 구성하는 배열.
    // DFS로 모든 가능한 순열을 만들 때, 순열의 각 자리 값을 저장함.

    // ch : 순열이니까 체크 배열 필요
    // (숫자가 순열에서 중복으로 사용되지 않도록 체크하는 역할)
    static int n, f; // n : 숫자, f : final number
    boolean flag = false; // 답 찾은 경우 재귀를 멈출 용도
    static int[][] dy = new int[35][35]; // 메모이제이션 용도

    public int combi(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        if (dy[n][r] > 0) {
            return dy[n][r];
        } else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }
    public void DFS(int L, int sum) {
        if(flag) {
            return;
        }
        if (L == n) { // n개 중 n개를 뽑는 순열이 하나 완성된 것
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                    flag = true;
                }
            }
        } else {
            for (int i = 1; i <= n; i++) { // i는 순열을 만드는 숫자 o, 인덱스 번호 x
                if (ch[i] == 0) { // i를 아직 사용하지 않았음
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0; // 백트래킹시 체크 풀어주기
                }
            }

        }

    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        // n = 4, f = 16
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i);
        }
        T.DFS(0, 0);
    }
}