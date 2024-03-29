import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < N; i++) {
            set.add(arr1[i]);
        }
        for(int i = 0; i < M; i++) {
            if(set.contains(arr2[i])) {
                builder.append("1 ");
            } else {
                builder.append("0 ");
            }
        }

        System.out.println(builder.toString());
    }
}
