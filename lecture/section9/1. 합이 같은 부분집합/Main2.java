import java.util.Scanner;
// 이것도 정답 처리는 된다
// 단, 첫번째 코드는 더 세밀한 조건상 더 빠르게 탐색을 종료할 가능성이 높고
// 아래 두번째 코드는 불필요한 부분합 검사는 생략하지만 입력 데이터가 크면 클수록 성능상 차이가 더 커질수도?
public class Main {
    static int total,n;
    static int[] arr;
    static String answer = "NO";

    public void DFS(int L, int sum) {
        if (answer.equals("YES")) {
            return;
        }
        if (L == n) {
            return;
        }
        if(total == sum * 2) {
            answer = "YES";
        } else {
            DFS(L+1, sum+arr[L]);
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0);
        System.out.println(answer);

    }
}