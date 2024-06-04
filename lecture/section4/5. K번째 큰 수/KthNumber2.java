import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
// TreeSet 사용 풀이 - RuntimeError
public class KthNumber2 {
	public int solution(int[] arr, int n, int k) {
		int answer = 0 ;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					int sum = 0;
					sum += arr[i];
					sum += arr[j];
					sum += arr[l];
					Tset.add(sum);
				}
			}
		}
		for (int i = 0; i < k - 1; i++) {
			Tset.pollFirst();
		}
		if(Tset.first() != null) {
			answer = Tset.first();

		} else {
			answer = -1;
		}
		return answer;
	}
	public static void main(String[] args) {
		KthNumber2 T = new KthNumber2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.print(T.solution(arr, n, k));
	}
}