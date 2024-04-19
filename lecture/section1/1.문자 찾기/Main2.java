import java.util.Scanner;
// 답안 풀이 2
class Main2 {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		// forEach: 배열이나 iterator를 제공하는 컬렉션 프레임워크가 들어와야
		for(char x : str.toCharArray()) {
			if(x==t) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.print(T.solution(str, c));
	}
}