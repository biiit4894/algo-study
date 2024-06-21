import java.util.Arrays;
import java.util.Scanner;
// 정답 풀이 - 오름차순 정렬 사용하기
class Main {
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main T = new Main();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}