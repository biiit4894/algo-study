import java.util.*;
// 나의 풀이
// 이렇게 풀면 순열을 구함

public class Main {
    static int n, m;
    static int[] ch;
    static Stack<Integer> stack = new Stack<>();

    public void DFS(int L) {
        if (L == m) {
            for (int x : stack) {
                System.out.print(x +" ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    stack.push(i);
                    DFS(L + 1);
                    ch[i] = 0;
                    stack.pop();
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n + 1];
        T.DFS(0);
    }
}