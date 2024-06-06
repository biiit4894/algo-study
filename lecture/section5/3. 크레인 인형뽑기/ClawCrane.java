import java.util.Scanner;
import java.util.Stack;

public class ClawCrane {
	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if(!stack.isEmpty() && stack.peek() == board[j][moves[i] - 1]) {
						stack.pop();
						answer+=2;
					} else {
						stack.push(board[j][moves[i] - 1]);
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		ClawCrane T = new ClawCrane();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, board, m, moves));
	}
}