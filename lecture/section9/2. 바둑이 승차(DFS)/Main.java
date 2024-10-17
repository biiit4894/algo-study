import java.util.Scanner;
// 나의 풀이
public class Main {
    static int c, n, total = 0;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    public void DFS(int L, int sum) {
//        if (total < sum) {
//            return; // 그냥 min_value 출력됨
//        }
        if(L == n) {
            if (sum <= c && sum > max) {
                max = sum;
            }
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }

        // 아예 리턴문을 추가해도 정답처리됨
//        if(sum > c) { // 리턴문에 무게의 합이 제한값보다 큰 경우 포함
//            return;
//        }
//
//        if(L == n) {
//            if (sum > max) { // 그 대신 레벨과 n이 같을 때의 조건 축소
//                max = sum;
//            }
//        } else {
//            DFS(L + 1, sum + arr[L]);
//            DFS(L + 1, sum);
//        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        System.out.println(total);
        T.DFS(0, 0);
        System.out.println(max);
    }
}