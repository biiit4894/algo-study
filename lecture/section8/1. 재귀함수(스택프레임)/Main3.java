public class Main3 {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " "); // 3 입력 -> 1 2 3
        }
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        T.DFS(3);
    }
}