import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// 나의 풀이
class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if(o.e == this.e) {
            return this.s - o.s; // 시작 시간 오름차순
        } else {
            return this.e - o.e;
        }
    }
}

public class Main {
    public int solution(ArrayList<Time> times) {
        int count = 0;
        Collections.sort(times);
        int end = Integer.MIN_VALUE;
        for(Time time : times) {
            if (time.s >= end) {
                end = time.e;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            times.add(new Time(s, e));
        }
        System.out.println(T.solution(times));
    }
}