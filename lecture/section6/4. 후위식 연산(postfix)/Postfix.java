import java.util.Scanner;
import java.util.Stack;
// 극악의 풀이 - 이건 너무 아닌 것 같아서 해설을 먼저 듣고..
public class Postfix {
	public int solution(String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for (char x : s.toCharArray()) {
			if (!stack.isEmpty() && (x == '+' || x == '-')) {
				if (x == '+') {
					int last = stack.pop();
					if (Character.isDigit(stack.peek())) {
						int secondLast = stack.pop();
						answer = last + secondLast;
					} else {
						answer += last;
					}

				} else if (x == '-') {
					int last = stack.pop();
					if (!stack.isEmpty() && Character.isDigit(stack.peek())) {
						int secondLast = stack.pop();
						answer = last - secondLast;
					} else {
						answer -= last;
					}
				}
			} else if (!stack.isEmpty() && (x == '*' || x == '/')) {
				if (x == '*') {
					int last = stack.pop();
					answer *= last;
				} else if (x == '/') {
					int last = stack.pop();
					answer /= last;
				}
			} else {
				stack.push(x);
			}
		}
		System.out.println(stack);

		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Postfix T = new Postfix();
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}