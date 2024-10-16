import java.util.Scanner;

public class Main {
    static int n, total = 0;
    //    static int[] arr;
    static String answer = "NO";
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if(flag) {
            return;
        }
        if(sum > total / 2) { // 이 재귀는 더 돌 필요가 없는 재귀
            return;
        }
        if(L == n) { // 최대 원소의 개수와 레벨의 수가 같을 때 부분집합이 완성됨
            if((total - sum) == sum) {
                answer = "YES";
                flag = true; // 이 재귀는 더 돌 필요가 없는 재귀
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}