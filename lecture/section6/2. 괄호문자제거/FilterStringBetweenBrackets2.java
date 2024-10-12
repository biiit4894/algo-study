import java.util.Scanner;
import java.util.Stack;
// 극악의 코드를 바꿔보자 (RuntimeError)
public class FilterStringBetweenBrackets2 {
	public String solution(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == ')') {
				while (!stack.isEmpty() && stack.pop() != '(') {
					stack.pop();
				}
			} else {
				stack.push(ch);
			}
		}

		StringBuilder answer = new StringBuilder();
		for (char ch : stack) {
			answer.append(ch);
		}

		return answer.toString();
	}
	public static void main(String[] args) {
		FilterStringBetweenBrackets2 T = new FilterStringBetweenBrackets2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}