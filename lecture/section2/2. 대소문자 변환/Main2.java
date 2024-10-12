import java.util.Scanner;

// ASCII 숫자 사용 풀이
// 대문자 : 65~90
// 소문자 : 97~122
// 소문자 - 32 -> 대문자
// 대문자 + 32 -> 소문자
public class Main2 {
	public String solution(String str) {
		String answer = "";
		for (char x : str.toCharArray()) {
			if (x >= 97 && x <= 122) {
				answer += (char)(x - 32);
			} else {
				answer += (char)(x + 32);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}