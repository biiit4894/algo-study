import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// 나의 풀이(오답)
class Time implements Comparable<Time> {
    int aT, lT; // arrive Time, leave Time
    Time(int aT, int gT) {
        this.aT = aT;
        this.lT = gT;
    }

    @Override
    public int compareTo(Time o) {
        if(this.aT == this.lT) {
            return this.lT - o.lT;
        } else {
            return this.aT - o.aT;
        }
    }

    // 14 18
    // 12 15
    // 15 20
    // 20 30
    // 5 14

    // 5 14
    // 12 15
    // 14 18
    // 15 20
    // 20 30


}
public class Main {
    public int solution(ArrayList<Time> times) {
        int cnt = 0;
        int end = Integer.MAX_VALUE;
        Collections.sort(times);
        for(Time time : times) {
            if(time.aT <= end) {
                end = time.lT;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr));
    }
}