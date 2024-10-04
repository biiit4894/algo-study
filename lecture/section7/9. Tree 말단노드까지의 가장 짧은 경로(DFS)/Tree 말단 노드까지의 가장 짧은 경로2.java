
// NPE 방지까지 되도록 해보자

class Node {
    int data;
    Node lt, rt;

    Node(int value) {
        data = value;
        lt = rt = null;
    }
}
public class Main {
    Node root;
    public int DFS(int L, Node root) {
        // 추가
        if (root == null) {
            return Integer.MAX_VALUE; // 매우 큰 값을 반환해 해당 경로가 선택되지 않도록 한다.
        }
        if (root.lt == null && root.rt == null ) {
            return L;
        } else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.DFS(0, T.root));;
    }
}