// 수열 값을 저장해서 시간 단축시키기
public class Main2 {
    static int[] fibo;
    public int DFS(int n) {
        if (n == 1) {
            return fibo[n] = 1; // 그냥 return 1을 할 경우 0 출력
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " "); // 전체 출력 5~6초
        }
    }
}