import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
// 시간초과 슬라이딩 윈도우로 개선
public class Sales2 {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		answer.add(map.size());

		for(int i = k; i < n; i++) {
			int lt = arr[i - k];
			if(map.get(lt) == 1) {
				map.remove(lt);
			} else {
				map.put(lt, map.get(lt) - 1);
			}

			int rt = arr[i];
			map.put(rt, map.getOrDefault(rt, 0) + 1);
			answer.add(map.size());
		}
		return answer;
	}
	public static void main(String[] args) {
		Sales2 T = new Sales2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}
}