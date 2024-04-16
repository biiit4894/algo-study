class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        if(arr.length % 2 != 0) {
            for(int i = 0; i <= arr.length / 2; i++) {
                arr[i * 2] = arr[i * 2] + n; 
            }
        } else {
            for(int i = 1; i <= arr.length / 2; i++) {
                arr[i * 2 - 1] = arr[i * 2 - 1] + n;
            }
        }
        return arr;
    }
}