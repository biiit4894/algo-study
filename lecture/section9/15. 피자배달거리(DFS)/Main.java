import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 오답 풀이
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int n, m;
    static int[][] map;
    static int[][] ch; // 피자집 방문 확인용 배열
    static ArrayList<Point> pizzaStore = new ArrayList<>();
    static ArrayList<Integer> distance = new ArrayList<>();

    public void DFS(int x, int y) {
        int deliveryDistance = Integer.MAX_VALUE;
        for (int i = 0; i < pizzaStore.size(); i++) {
            deliveryDistance = Math.min(deliveryDistance, (Math.abs(x - pizzaStore.get(i).x) + Math.abs(y - pizzaStore.get(i).y)));
            System.out.print(deliveryDistance + " => ");
        }
        System.out.println();
        distance.add(deliveryDistance);
    }
    public void solution(int[][] arr) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 1) {
                    System.out.println("i: " + i + ", j: " + j);
                    DFS(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 열 번호
        m = kb.nextInt(); // 행 번호
        map = new int[n + 1][n + 1];
        ch = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = kb.nextInt();
                if (map[i][j] == 2) {
                    pizzaStore.add(new Point(i, j));
                }
                // 0 빈칸 / 1 집 / 2 피자집
            }
        }
        T.solution(map);
        Collections.sort(distance);
        int answer = 0;
        for(int d : distance) {
            System.out.print(d + " ");
            answer += d;
        }
        System.out.println(answer);
    }
}