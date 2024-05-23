import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class RankCalculator {

    public int[] solution(int n, int[] arr) {
        int[] basicArr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr);
        for(int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            answer[i] = findIndex(arr, basicArr[i]) + 1;
        }
        return answer;
    }

    private int findIndex(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RankCalculator T = new RankCalculator();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}