import java.util.Scanner;
import java.util.Stack;
// 정답 풀이
public class Main {
	public int solution(String str) {
		int answer;
		Stack<Integer> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				stack.push(x - 48);
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if (x == '+') {
					stack.push(lt + rt);
				} else if (x == '-') {
					stack.push(lt - rt);
				} else if (x == '*') {
					stack.push(lt * rt);
				} else if (x == '/') {
					stack.push(lt / rt);
				}
			}
		}
		answer = stack.get(0);
		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Main T = new Main();
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}