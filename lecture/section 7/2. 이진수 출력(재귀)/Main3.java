public class Main3 {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n /2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        T.DFS(11);
    }
}