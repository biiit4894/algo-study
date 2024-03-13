class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++) {
            answer = lcd(answer, arr[i]);
        }
        return answer;
    }
    
    // 소인수분해 ??
    // 2 | 12 48
    // 2 | 6  24
    // 3 | 3  12
    //    ______
    //     1   4
    // gcd = 2 * 2 * 3 = 12
    // lcd = 2 * 2 * 3 * 4 = 48
    
    // a > b 라면,
    // a % b == 0 -> 최대공약수는 b;
    // tmp = a % b
    // a = b
    // b = tmp
    
    public int lcd(int a, int b) {
        int x = a;
        int y = b;
        while(x % y != 0) {
            int tmp = x % y;
            x = y;
            y = tmp;
        }
        return a * b / y;
    }
}