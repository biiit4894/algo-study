import java.util.Scanner;
// 정답 풀이
public class Main {
    public String solution(String s) {
        String answer = "YES";
        s = s.toLowerCase();
        int len = s.length();
        for(int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                answer = "NO";
                break;// 또는 return "NO"
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }
}