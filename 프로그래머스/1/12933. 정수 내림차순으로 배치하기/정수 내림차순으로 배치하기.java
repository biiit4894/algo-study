import java.util.Scanner;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = "" + n;
        
        int[] arr = new int[a.length()];
        
        int count = 0;
        while(n > 0) {
            arr[count++] = (int) (n % 10);
            n /= 10;
        }
        
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i] * Math.pow(10, i);
        }
        return answer;
    }
}