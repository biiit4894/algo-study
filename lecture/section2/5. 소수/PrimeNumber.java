import java.util.ArrayList;
import java.util.Scanner;
// 시간초과
public class PrimeNumber {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n - 1];
        for(int i = 2; i <= n; i++) {
            arr[i - 2] = i;
        }
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j <= n; j++) {
                if ((arr[i - 2] != j) && (arr[i - 2] % j == 0)) {
                    arr[i - 2] = 0;
                }
            }
        }

        for(int x : arr) {
            if (x != 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
