import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;

// 나의 풀이

public class ClassPresident {
	public String solution(int n, String str) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String key = str.substring(i, i + 1);
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		int max_count = Integer.MIN_VALUE;
		for (String key : map.keySet()) {
			if (max_count < map.get(key)) {
				max_count = map.get(key);
			}
		}
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, Integer> entry = entries.next();
			if(entry.getValue() == max_count) {
				answer = entry.getKey();
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ClassPresident T = new ClassPresident();

		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
