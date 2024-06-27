import java.util.Scanner;

public class Main {

    // StackOverflow error
    public void DFS(int n) {
        System.out.println(n);
        DFS(n - 1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }
}