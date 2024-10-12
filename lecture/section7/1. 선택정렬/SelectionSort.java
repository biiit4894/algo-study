uimport java.util.*;

public class SelectionSort {
    public ArrayList<Integer> solution(int n, int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            swap(arr, min_index, i);
        }

        for (int x : arr) {
            answer.add(x);
        }

        return answer;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        SelectionSort T = new SelectionSort();
        Scanner kb = new Scanner(System.in);
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