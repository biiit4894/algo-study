import java.util.*;
// 나의 풀이
class BinSearch {
    public int solution(int n, int m, int[] arr) {
        int lt = 0;
        int rt = n - 1;
        int pc = 0;
        Arrays.sort(arr);

        while (lt <= rt) {
            pc = (lt + rt) / 2;
            if (arr[pc] == m) {
                return pc + 1;
            } else if (arr[pc] < m) {
                lt = pc + 1;
            } else {
                rt = pc - 1;
            }
        }

        return pc;
    }
    public static void main(String[] args) {
        BinSearch T = new BinSearch();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}