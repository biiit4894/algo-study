import java.util.Scanner;
import java.util.Stack;
// 초기 극악한 코드 (ArrayIndexOutOfBounds)
public class FilterStringBetweenBrackets {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		System.out.println(stack);
		int left = 0, right = 0;
		for (int i = 0; i < str.length(); i++) {
			if (right - left > 1) {
				for (int j = left; j < right; j++) {
					stack.remove(str.charAt(j+1));
					// j + 1이 문자열 길이를 초과하는 인덱스일 경우가 있기 때문에 ArrayIndexOutOfBoundsException 발생
					// remove는 인덱스를 받는 메서드인데 객체를 받아 제거하고 있음
				}
			}
			if (str.charAt(i) == '(') {
				left = i;
			} else {
				if(str.charAt(i) == ')') {
					right = i;
				}
			}
		}
		System.out.println(stack);



		return answer;
	}
	public static void main(String[] args) {
		FilterStringBetweenBrackets T = new FilterStringBetweenBrackets();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}