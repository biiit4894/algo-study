import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// 나의 풀이
public class KthNumber {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < 2; i++) {
			sum += arr[i];
		}

		int lt = 0;
		for (int rt = 2; rt < n; rt++) {
			sum += arr[rt];
			list.add(sum);
			sum -= arr[lt];
			lt++;
		}
		Collections.sort(list, Collections.reverseOrder());


		return list.get(k - 1);
	}
	public static void main(String[] args) {
		KthNumber T = new KthNumber();
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