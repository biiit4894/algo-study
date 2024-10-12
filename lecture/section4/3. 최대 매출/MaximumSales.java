import java.util.Scanner;
// 시간 초과
public class MaximumSales {
	public int solution(int n, int k, int[] arr) {
		int answer = Integer.MIN_VALUE;
		int p1 = 0, p2 = p1 + k - 1;
		while(p1 < n && p2 < n) {
			int sum = 0;
			for (int i = p1; i <= p2; i++) {
				sum += arr[i];
			}
			if (answer < sum) {
				answer = sum;
			}
			p1++;
			p2++;
		}
		return answer;
	}

	public static void main(String[] args) {
		MaximumSales T = new MaximumSales();
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