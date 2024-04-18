import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static boolean binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(target == arr[mid]) {
				return true;
			} else if(target > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] arr1 = new int[n];

		for(int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt();
		}

		int m = scanner.nextInt();
		int[] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
			arr2[i] = scanner.nextInt();
		}

		Arrays.sort(arr1);

		for(int i = 0; i < m; i++) {
			if(binarySearch(arr1, arr2[i])) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
