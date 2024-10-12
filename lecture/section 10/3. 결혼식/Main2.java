import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// 정답
class Time implements Comparable<Time> {
    public int time;
    public char state; // 's', 'e'
    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if(this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}
public class Main2 {
    public int solution(ArrayList<Time> times) {
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        Collections.sort(times);
        for (Time time : times) {
            if (time.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
           answer = Math.max(answer, cnt)
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Time(x, 's'));
            arr.add(new Time(y, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}