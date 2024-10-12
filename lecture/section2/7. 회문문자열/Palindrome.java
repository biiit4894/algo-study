import java.util.Scanner;

public class Palindrome {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                answer = "YES";
            }  else {
                answer = "NO";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Palindrome T = new Palindrome();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }
}