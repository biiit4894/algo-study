import java.util.Scanner;
// 정답 풀이
public class Main {
	public String solution(int n, int[] arr1, int[] arr2) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (arr1[i] == arr2[i]) {
				answer += "D";
			} else if(arr1[i] == 1 && arr2[i] == 3) {
				answer += "A";
			} else if (arr1[i] == 2 && arr2[i] == 1) {
				answer += "A";
			} else if (arr1[i] == 3 && arr2[i] == 2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a_arr = new int[n];
		for (int i = 0; i < n; i++) {
			a_arr[i] = kb.nextInt();
		}
		int[] b_arr = new int[n];
		for (int i = 0; i < n; i++) {
			b_arr[i] = kb.nextInt();
		}
		for (char x : T.solution(n, a_arr, b_arr).toCharArray()) {
			System.out.println(x);
		}
	}
}
