import java.lang.System;
import java.util.Scanner;

// 나의 풀이
public class FindString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		String str = scanner.next();
		String c = scanner.next();
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equalsIgnoreCase(c)) {
				count++;
			}
		}
		System.out.println(count);
	}
}

