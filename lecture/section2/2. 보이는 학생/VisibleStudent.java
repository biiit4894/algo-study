import java.util.Scanner;

public class VisibleStudent {
    private static int solution(int[] heights) {
        int count = 1;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < heights.length-1; i++) {
            if((heights[i+1] > heights[i]) && (heights[i+1] > max)) {
                count++;
                max = heights[i + 1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        System.out.println(solution(heights));
    }
}
