import java.util.Scanner;
// 나의 풀이(메모이제이션 사용 x)
public class Main {
    static int answer;
    public void DFS(int n, int r) {
        if (n == r || r == 0) {
            answer += 1;
        } else {
            DFS(n - 1, r - 1);
            DFS(n - 1, r);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        T.DFS(n, r);
        System.out.println(answer);
    }
}