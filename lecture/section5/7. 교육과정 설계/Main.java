import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String a, String b) {
        String answer = "YES";

        Queue<Character> Q = new LinkedList<>();
        for (char x : a.toCharArray()) {
            Q.offer(x);
        }

        for (char x : b.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) {
                    return "NO";
                }
            }
        }

        if (!Q.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main T = new Main();
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }
}