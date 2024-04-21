import java.util.Scanner;
// 나의 풀이
public class Fibonacci {
    public String solution(int n) {
        String answer = "";
        int a1 = 1;
        int a2 = 1;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                arr[i] = a1;
            } else if(i == 1) {
                arr[i] = a2;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.print(arr[i] + " ");
        }
        return answer;
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        T.solution(n);
    }
}
