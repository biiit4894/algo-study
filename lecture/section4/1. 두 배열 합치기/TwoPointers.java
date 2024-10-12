import java.util.Arrays;
import java.util.Scanner;
// 나의 풀이
public class TwoPointers {
	public int[] solution(int n, int m, int[] arr1, int[] arr2) {
		int[] answer = new int[n + m];
		for (int i = 0; i < n; i++) {
			answer[i] = arr1[i];
		}
		for (int i = n; i < n + m; i++) {
			answer[i] = arr2[i - n];
		}
		Arrays.sort(answer);
		return answer;
	}
	public static void main(String[] args) {
		TwoPointers T = new TwoPointers();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr1 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = kb.nextInt();
		}

		int m = kb.nextInt();
		int[] arr2 = new int[m];

		for (int i = 0; i < m; i++) {
			arr2[i] = kb.nextInt();
		}

		for (int x : T.solution(n, m, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}
}