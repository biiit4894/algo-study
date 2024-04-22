import java.util.Arrays;
import java.util.Scanner;
// 나의 풀이
public class TwoPointers {
	public int[] solution(int[] arr1, int[] arr2) {
		int[] answer = new int[arr1.length + arr2.length];
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for(int i = 0; i < arr1.length; i++) {
			answer[i] = arr1[i];
		}
		for(int i = arr1.length; i < arr1.length + arr2.length; i++) {
			answer[i] = arr2[i - arr1.length];
		}

		Arrays.sort(answer);

		return answer;
	}

	public static void main(String[] args) {
		Scanner kd = new Scanner(System.in);
		TwoPointers T = new TwoPointers();
		int n = kd.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = kd.nextInt();
		}

		int m = kd.nextInt();
		int[] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
			arr2[i] = kd.nextInt();
		}

		for (int i : T.solution(arr1, arr2)) {
			System.out.print(i + " ");
		}
	}
}
