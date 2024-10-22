import java.util.Scanner;
// 정답 풀이(메모이제이션 사용 o)

public class Main3 {
    int[][] dy = new int[34][34];

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }

    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n, r));

    }
}