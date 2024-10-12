import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
// 시간초과
public class Sales {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n - k + 1; i++) {
			map.clear();

			for(int rt = i; rt < i + k; rt++) {

				map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

			}
			answer.add(map.size());
		}
		return answer;
	}
	public static void main(String[] args) {
		Sales T = new Sales();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}