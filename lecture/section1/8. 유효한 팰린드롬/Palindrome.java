import java.util.Scanner;
// 나의 풀이
public class Palindrome {
	public String solution(String s) {
		String answer = "NO";
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) {
			answer = "YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		Palindrome T = new Palindrome();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solution(s));

	}
}