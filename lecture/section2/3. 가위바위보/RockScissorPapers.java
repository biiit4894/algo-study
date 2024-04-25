import java.util.Scanner;
// 나의 풀이
public class RockScissorPapers {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		// 1: 가위
		// 2: 바위
		// 3: 보
		for (int i = 0; i < n; i++) {
			if((arr1[i] == 1 && arr2[i] == 3) || (arr1[i] == 2 && arr2[i] == 1) || (arr1[i] == 3 && arr2[i] == 2)) {
				answer[i] = "A";
			} else if ((arr1[i] == 3 && arr2[i] == 1) || (arr1[i] == 1 && arr2[i] == 2) || (arr1[i] == 2 && arr2[i] == 3)) {
				answer[i] = "B";
			} else if((arr1[i] == 3 && arr2[i] == 3) || (arr1[i] == 1 && arr2[i] == 1) || (arr1[i] == 2 && arr2[i] == 2)){
				answer[i] = "D";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		RockScissorPapers T = new RockScissorPapers();
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
		for (String x : T.solution(n, a_arr, b_arr)) {
			System.out.println(x);
		}
	}
}
