import java.util.ArrayList;
import java.util.Scanner;

// 나의 풀이

public class BiggerNumber {
	public ArrayList<Integer> solution(int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i - 1] < arr[i]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		BiggerNumber T = new BiggerNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int i = 0; i < T.solution(arr).size(); i++) {
			System.out.print(T.solution(arr).get(i) + " ");
		}
	}
}