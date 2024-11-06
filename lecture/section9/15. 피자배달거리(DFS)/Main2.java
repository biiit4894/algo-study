import java.util.ArrayList;
import java.util.Scanner;
// 조합을 통해 피자집을 선택하도록 수정
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main2 {
    static int n, m;
    static int[][] map;
    static ArrayList<Point> pizzaStore = new ArrayList<>();
    static ArrayList<Point> houses = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int L, int s, ArrayList<Point> selectedPizza) {
        if (L == m) {  // m개의 피자집을 선택했을 때
            int sum = 0;
            for (Point house : houses) {
                int deliveryDistance = Integer.MAX_VALUE;
                for (Point pizza : selectedPizza) {
                    deliveryDistance = Math.min(deliveryDistance,
                            Math.abs(house.x - pizza.x) + Math.abs(house.y - pizza.y));
                }
                sum += deliveryDistance;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < pizzaStore.size(); i++) {
                selectedPizza.add(pizzaStore.get(i));
                DFS(L + 1, i + 1, selectedPizza);
                selectedPizza.remove(selectedPizza.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        map = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = kb.nextInt();
                if (map[i][j] == 1) {
                    houses.add(new Point(i, j));
                } else if (map[i][j] == 2) {
                    pizzaStore.add(new Point(i, j));
                }
            }
        }

        DFS(0, 0, new ArrayList<>());  // 조합을 통해 피자집 선택
        System.out.println(answer);
    }
}
