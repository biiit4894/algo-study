import java.util.Scanner;

public class MaxSum {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int row_sum = 0;
        // 각 행의 합
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                row_sum += arr[i][j];
                System.out.println("i: " + i + ", j: " + j);
            }
            if(answer < row_sum) {
                answer = row_sum;
                System.out.println("here1");
            }
            row_sum = 0;
        }
        // 각 열의 합
        int col_sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; i < n; i++) {
                col_sum += arr[j][i];
                System.out.println("i: " + i + ", j: " + j);
            }
            if(answer < col_sum) {
                answer = col_sum;
                System.out.println("here2");
            }
            col_sum = 0;
        }

        // 두 대각선의 합
        int diagon_sum1 = 0;
        for(int i = 0; i < n; i++) {
            diagon_sum1 += arr[i][i];
        }
        if(diagon_sum1 > answer) {
            answer = diagon_sum1;
            System.out.println("here3");
        }
        int diagon_sum2 = 0;
        for(int i = 0; i < n; i++) {
            diagon_sum2 += arr[i][n - 1 - i];
        }
        if(diagon_sum2 > answer) {
            answer = diagon_sum2;
            System.out.println("here4");
        }
        return answer;
    }
    public static void main(String[] args) {
        MaxSum T = new MaxSum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
