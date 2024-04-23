import java.util.Scanner;

// charArray, HashMap 사용 풀이
class Main {
	public char solution(int n, String str) {
		char answer = '';
		HashMap<Character, Integer> map = new HashMap<>();
		for (char key : str.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			if(max < map.get(key)) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	public static void main(String[] args ) {
		Scanner kb = new Scanner(System.in);
		Main T = new Main();
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(n, str));

	}
}