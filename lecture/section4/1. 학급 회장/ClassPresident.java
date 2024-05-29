import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public char solution(int n, String str) {
		char answer = 0;
		int max = Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		for(int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			if (map.get(arr[i]) > max) {
				max = map.get(arr[i]);
				answer = arr[i];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}