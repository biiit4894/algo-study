import java.util.Scanner;
// 나의 풀이 (이중for문)
class DuplicateCheck {
    public String solution(int n, int[] arr) {
        String answer = "U";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return "D";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DuplicateCheck T = new DuplicateCheck();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}