import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();

        String input = sc.nextLine();

        for(int i = 0; i < input.length(); i++) {
            for(int j = i + 1; j < input.length() + 1; j++) {
                stringSet.add(input.substring(i, j));
            }
        }

        System.out.println(stringSet.size());
    }
}
