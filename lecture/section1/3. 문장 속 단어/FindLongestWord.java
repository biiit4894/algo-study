import java.util.Scanner;

public class FindLongestWord {
	public String solution(String str) {
		String answer = "";
		String[] arr = str.split(" ");
		int max = 0;
		for(String word : arr) {
			if(word.length() > max) {
				max = word.length();
				answer = word;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		FindLongestWord T = new FindLongestWord();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
