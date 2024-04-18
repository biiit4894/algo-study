import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

// BOJ 1920. 수 찾기
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		HashSet<Integer> set1 = new HashSet<>();

		for(int i = 0; i < n; i++) {
			int num1 = scanner.nextInt();
			set1.add(num1);
		}

		int m = scanner.nextInt();
		int[] set2 = new int[m];

		for(int i = 0; i < m; i++) {
			int num2 = scanner.nextInt();
			set2[i] = num2;
		}

		for (int i : set2) {
			if (set1.contains(i)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}
