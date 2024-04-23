import java.lang.System;

public class ReverseString {
	public static String solution(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	public static void main(Stirng[] args) {
		ReverseString T = new ReverseString();
		Scanner kb = new Scanner(System.in);
		int count = kb.nextInt();
		for(int i = 0; i < count; i++) {
			String input = kb.next();
			System.out.println(solution(input));
		}
	}
}