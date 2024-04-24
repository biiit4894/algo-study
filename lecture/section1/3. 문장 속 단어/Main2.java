import java.util.Scanner;
// 답안 풀이 2 : indexOf(), substring() 사용하기
public class Main2 {
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE;
		int pos = 0;
		while(pos = str.indexOf(' ') != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > max) {
				max = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		if (str.length() > max) {
			answer = str;
		}
		return answer;

	}

	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
