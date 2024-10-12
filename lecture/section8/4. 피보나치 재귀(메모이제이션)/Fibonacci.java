public class Fibonacci {
    public int DFS(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return DFS(n-1) + DFS(n-2);
        }
    }
    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        for (int i = 1; i <= 10; i++) {
            System.out.print(T.DFS(i) + " ");
        } // i = 45일 경우 마지막 숫자 출력에 오랜 시간 소요
    }
}