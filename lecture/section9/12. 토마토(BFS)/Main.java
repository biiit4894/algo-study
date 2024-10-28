import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

// 시간초과 풀이

class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int m, n, answer, unripeCnt;
    static int[][] box;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> ripe = new LinkedList<>(); // 익은 열매의 큐
    public void BFS() {
        Queue<Point> Q = new LinkedList<>(ripe);

        while (!Q.isEmpty()) { // unripeCnt > 0도 조건에 추가한다면 anyRipened 플래그 변수를 굳이 사용하지 않고 answer를 증가시키는 것이 괜찮아진다
            int ripeNum = Q.size(); // 하루동안 다른 토마토를 익히게 될 익은 토마토의 수
            boolean anyRipened = false;

            for (int k = 0; k < ripeNum; k++) {
                Point tmp = Q.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if (nx >= 0 && nx <= n - 1
                            && ny >= 0 && ny <= m - 1 && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        Q.offer(new Point(nx, ny));
                        unripeCnt--;
                        anyRipened = true;
                    }
                }
            }
            if (anyRipened) {
                answer++;

            }
        }

        if (unripeCnt > 0) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        box = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = kb.nextInt();
                if (box[i][j] == 1) {
                    ripe.offer(new Point(i, j));
                } else if (box[i][j] == 0) {
                    unripeCnt++;
                }
            }
        }

        if (unripeCnt == 0) {
            System.out.println(0);
        } else {
            T.BFS();
        }


    }
}