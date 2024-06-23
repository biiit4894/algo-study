import java.util.*;
// 나의 풀이(2차원 배열 사용, 오답)
class Coordinate {
    public int[][] solution(int n, int[][] arr) {
        for (int i = 0; i < n - 1; i++) {
            int tmp1, tmp2;
            if (arr[i][0] > arr[i + 1][0]) {
                tmp1 = arr[i][0];
                tmp2 = arr[i][1];
                arr[i][0] = arr[i + 1][0];
                arr[i + 1][0] = tmp1;
                arr[i][1] = arr[i + 1][1];
                arr[i + 1][1] = tmp2;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int tmp1, tmp2;
            if ((arr[i][0] == arr[i + 1][0]) && (arr[i][1] > arr[i + 1][1])) {
                tmp1 = arr[i][0];
                tmp2 = arr[i][1];
                arr[i][0] = arr[i + 1][0];
                arr[i + 1][0] = tmp1;
                arr[i][1] = arr[i + 1][1];
                arr[i + 1][1] = tmp2;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Coordinate T = new Coordinate();
        int n = kb.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int[][] answer = T.solution(n, arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}