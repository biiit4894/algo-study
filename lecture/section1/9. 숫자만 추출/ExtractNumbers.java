import java.util.Scanner;
// 나의 풀이
public class ExtractNumbers {

	public int solution(String s) {
		int answer;
		s = s.replaceAll("[a-zA-Z]", "");
		if (s.startsWith("0")) {
			s = s.replaceFirst("0", "");
		} // 사실 굳이 필요없다
		answer = Integer.parseInt(s);
		return answer;
	}
	public static void main(String[] args) {
		ExtractNumbers T = new ExtractNumbers();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.println(T.solution(s));
	}
}