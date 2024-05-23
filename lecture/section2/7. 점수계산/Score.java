import java.util.Scanner;
// 나의 풀이
public class Score {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 1 && arr[i + 1] == 0) {
                answer += count;
            } else if(arr[i] == 1 && arr[i + 1] == 1) {
                answer += count;
                count++;
            } else {
                count = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Score T = new Score();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr));

    }
}