import java.util.Scanner;
import java.util.ArrayList;

public class ReversedPrimeNumber {
	public boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int x: arr) {
			String str = Integer.toString(x);
			char[] charArr = str.toCharArray();
			for (int i = 0; i < str.length() / 2; i++) {
				char tmp = charArr[i];
				charArr[i] = charArr[str.length() - 1 - i];
				charArr[str.length() - 1 - i] = tmp;
			}
			str = "";
			for (int i = 0; i < charArr.length; i++) {
				str += charArr[i];

			}

			x = Integer.parseInt(str);
			if(isPrime(x)) {
				answer.add(x);
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		ReversedPrimeNumber T = new ReversedPrimeNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}