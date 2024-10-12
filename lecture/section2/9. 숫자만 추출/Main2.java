import java.util.Scanner;

// isDigit, parseInt 사용 풀이
public class Main2 {

	public int solution(String s) {
		String answer = "";
		for (char x : s.toCharArray()) {
			if (Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer); // 0208 -> 208
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}