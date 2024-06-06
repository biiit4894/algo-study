import java.util.Scanner;
import java.util.Stack;
// 나의 풀이 - 해설을 듣고 다시 풀어봤다
public class Postfix2 {
	public int solution(String s) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char x : s.toCharArray()) {
			if (Character.isDigit(x)) {
				stack.push(Integer.parseInt(Character.toString(x)));
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				switch(x) {
					case '+':
						stack.push(lt + rt);
						break;
					case '-':
						stack.push(lt - rt);
						break;
					case '*':
						stack.push(lt * rt);
						break;
					case '/':
						stack.push(lt / rt);
						break;
				}
			}
		}
		answer = stack.get(0);

		return answer;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Postfix2 T = new Postfix2();
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}