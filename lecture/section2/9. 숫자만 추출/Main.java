import java.util.Scanner;

// ASCII 숫자 풀이

public class Main {
	public int solution(String s) {
		int answer = 0;
		for (char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}