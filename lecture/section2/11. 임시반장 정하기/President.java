import java.util.Scanner;
// 나의 풀이(오답)
public class President {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(i != k && arr[i][j] == arr[k][j]) {
                        temp++;
                    }
                }
                if(temp > max) {
                    max = temp;
                    answer = i + 1;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        President T = new President();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));

    }
}