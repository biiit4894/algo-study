import java.util.Scanner;
// 오랜만에 다시 푸니
// 1 -> 2 -> 4 -> 5 -> 3으로 순회하고 5를 출력하게 만들어버렸다..
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
    int L = 1;

    public int DFS(Node root) {
        System.out.println(root.data);
        if (root == null) {
            L++;
        } else {
            if (root.lt != null) {
                L++;
                DFS(root.lt);
            }
            if (root.rt != null) {
                L++;
                DFS(root.rt);
            }
        }
        return L;
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.DFS(T.root));;

    }
}