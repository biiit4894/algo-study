import java.util.Scanner;
import java.util.HashMap;

public class Anagram {
    public String solution(String a, String b) {
        String answer = "YES";
        a = a.toUpperCase();
        b = b.toUpperCase();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : a.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        for(char x : b.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (char key : map1.keySet()) {
            if(map1.get(key) != map2.get(key)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Anagram T = new Anagram();
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }
}