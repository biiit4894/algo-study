import java.util.Scanner;
import java.util.HashMap;
// 나의 풀이 - 해시맵도 된다
class DuplicateCheck2 {
    public String solution(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String answer = "U";
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : arr) {
            if (map.get(x) > 1) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DuplicateCheck2 T = new DuplicateCheck2();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}