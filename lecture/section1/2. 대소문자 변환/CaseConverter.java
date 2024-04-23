import java.util.Scanner;

// 나의 풀이
public class CaseConverter {
	public String solution(String str) {
		String answer = "";
		char[] arr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == str.toUpperCase().charAt(i)) {
				arr[i] = str.substring(i, i + 1).toLowerCase().charAt(0);
			} else {
				arr[i] = str.substring(i, i + 1).toUpperCase().charAt(0);
			}
		}
		for(char x : arr) {
			answer += x;
		}
		return answer;
	}

	public static void main(String[] args) {
		CaseConverter T = new CaseConverter();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.println(T.solution(s));
	}
}