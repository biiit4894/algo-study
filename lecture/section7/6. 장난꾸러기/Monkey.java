import java.util.*;
// 나의 풀이
class Monkey {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> newMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, arr[i]);
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            newMap.put(i, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if(!Objects.equals(map.get(i), newMap.get(i))) {
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Monkey T = new Monkey();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}