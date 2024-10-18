import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// 시간초과 풀이
public class Main {
    static int n, m, answer = Integer.MAX_VALUE, sum; // 동전의 종류개수, 거슬러 줄 금액
    static Integer[] arr;
    public void DFS(int L, int sum) {
        if (sum > m) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
//                sum += arr[i];
//                DFS(L + 1, sum); // 이렇게 하면 4 나옴
                DFS(L + 1, sum + arr[i]); // 이건 3 나옴
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = kb.nextInt();
        T.DFS(0, sum);
        System.out.println(answer);

    }
}