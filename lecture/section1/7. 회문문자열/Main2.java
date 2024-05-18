import java.util.ArrayList;
import java.util.Scanner;
public class Main2 {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
