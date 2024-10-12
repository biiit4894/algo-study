import java.util.Scanner;

// indexOf 사용 풀이
public class Main {
	public String solution(String s) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == i) {
				answer += s.charAt(i);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solution(s));

	}
}