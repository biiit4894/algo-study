public class Main {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            System.out.print(n + " "); // 11 5 2 1
            DFS(n /2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }
}