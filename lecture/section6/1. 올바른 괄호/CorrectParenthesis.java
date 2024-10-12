import java.util.Scanner;
import java.util.Stack;
// 나의 풀이
public class CorrectParenthesis {
	public String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();

		for (char x : s.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else if (x == ')') {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		if (stack.contains('(')) {
			return "NO";
		} else if (stack.isEmpty()) { // 없어도 ok
			return "YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		CorrectParenthesis T = new CorrectParenthesis();
		String s = kb.next();
		System.out.print(T.solution(s));
	}
}