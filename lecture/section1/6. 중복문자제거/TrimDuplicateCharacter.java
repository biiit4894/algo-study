import java.util.ArrayList;
import java.util.Scanner;

// 나의 풀이
public class TrimDuplicateCharacter {
	public String solution(String s) {
		String answer = "";
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (list.contains(s.charAt(i))) {
				continue;
			}
			list.add(s.charAt(i));
		}
		for (char x : list) {
			answer += x;
		}
		return answer;
	}
	public static void main(String[] args) {
		TrimDuplicateCharacter T = new TrimDuplicateCharacter();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solution(s));

	}
}