import java.util.*;
// L(레벨), S(스타트 번호 - for문의 i + 1) 개념 숙지 후 풀이
public class Main2 {
    static int n, m;
    static int[] combi;

    public void DFS(int L, int s) {

        if (L == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(combi[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = s + 1; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i);
            }
        }
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];

        T.DFS(0, 0);
    }
}