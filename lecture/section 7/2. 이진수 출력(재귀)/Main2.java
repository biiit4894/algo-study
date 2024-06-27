public class Main2 {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            System.out.print(n % 2 + " "); // 1 1 0 1
            DFS(n /2);
        }
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        T.DFS(11);
    }
}