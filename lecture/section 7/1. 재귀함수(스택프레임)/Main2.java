import java.util.Scanner;

public class Main2 {

    // StackOverflow error
    public void DFS(int n) {
        if(n == 0) {
            return; // void형 메소드에서 함수를 종료시켜버리는 방법
        } else {
            System.out.print(n + " ");
            DFS(n - 1); // 3 입력 -> 3 2 1
        }
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        T.DFS(3);
    }
}