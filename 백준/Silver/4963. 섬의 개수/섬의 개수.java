import java.util.Scanner;
// 나의 풀이 : DFS 사용 풀이
public class Main {
    static int w, h;
    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1};

    public int solution() {
        int answer = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    DFS(i, j);
                }
            }
        }
        return answer;
    }

    public void DFS(int x, int y) {
        board[x][y] = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < h && ny >= 0 && ny < w && board[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        while(true) {
            w = kb.nextInt();
            h = kb.nextInt();
            if(w == 0 && h == 0) {
                break;
            }
            board = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    board[i][j] = kb.nextInt();
                }
            }
            System.out.println(T.solution());
        }
        
    }
}