import java.util.Scanner;
import java.util.Stack;
// 정답 풀이
public class Main {
	// pop() : 스택의 최상단을 제거하고 반환함.
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (x == ')') {
				while (stack.pop() != '(') { // (를 만나면 꺼내고 멈춤
				}
			} else {
				stack.push(x);
			}
		}
		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}