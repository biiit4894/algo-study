class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] arr = new char[control.length()];
        
        for(int i = 0; i < control.length(); i++) {
            arr[i] = control.charAt(i);
        }
        
        for(char c : arr) {
            if(c == 'w') n++;
            else if(c == 's') n--;
            else if(c == 'd') n += 10;
            else if(c == 'a') n -= 10;
        }
        return n;
    }
}