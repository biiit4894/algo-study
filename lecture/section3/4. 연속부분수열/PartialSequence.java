import java.util.Scanner;
// 시간초과 풀이
public class PartialSequence {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) { // O(n^2)
				sum += arr[j];
				if (sum == m) {
					answer++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		PartialSequence T = new PartialSequence();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}