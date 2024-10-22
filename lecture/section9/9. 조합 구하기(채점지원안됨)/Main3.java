import java.util.*;
// 정답 풀이
public class Main3 {
    static int n, m;
    static int[] combi;

    public void DFS(int L, int s) {

        if (L == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(combi[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];

        T.DFS(0, 1);
    }
}