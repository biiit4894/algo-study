import java.util.Scanner;
// 답안 풀이 1 : split() 사용하기

class Main1 {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}