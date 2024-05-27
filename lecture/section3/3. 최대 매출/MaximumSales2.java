import java.util.Scanner;
// 시간 초과 해결 풀이
public class MaximumSales2 {
	public int solution(int n, int k, int[] arr) {
		int answer = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		answer = sum;

		for (int i = k; i < n; i++) {
			sum += arr[i] - arr[i - k];
			if (answer < sum) {
				answer = sum;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		MaximumSales2 T = new MaximumSales2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}