import java.util.Scanner;
// 나의 풀이
public class ContinuousNumberSum {
	public int solution(int n) {
		int answer = 0, sum = 0, lt = 1;
		for(int rt = 1; rt <= n; rt++) {
			sum += rt;
			if (sum == n && lt != rt) {
				answer++;
			}
			while (sum >= n) {
				sum -= lt++;
				if(sum == n && lt != rt) {
					answer++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		ContinuousNumberSum T = new ContinuousNumberSum();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}