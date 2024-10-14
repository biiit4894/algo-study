import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph; // 인접리스트
    static int[] ch, dis; // 정점 방문 여부 저장, 정점마다의 최소 거리 저장

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>(); // 현재 위치한 정점을 저장
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll(); // current vertex
            for(int nv : graph.get(cv)) { // next vertex의 후보군 중에서
                if(ch[nv] == 0) { // next vertex를 방문한 적이 없다면
                    ch[nv] = 1; // 방문하고
                    queue.offer(nv); // 큐에 저장
                    dis[nv] = dis[cv] + 1; // cv -> nv의 최단거리는 cv까지의 최단 거리 + 1
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n + 1];
        dis = new int[n + 1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i +" : " +dis[i]);
        }
    }
}