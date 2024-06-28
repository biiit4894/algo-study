// 재귀함수 활용 첫 풀이
public class Main {
    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        int n = 10; // 45로만 바꿔봐도 마지막 숫자 출력에 오랜 시간 소요
        for (int i = 1; i <= n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
    }
}