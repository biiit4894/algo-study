import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr1 = s.split("\\s");
        int[] arr2 = new int[arr1.length];
        
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        int max = Arrays.stream(arr2).max().getAsInt();
        int min = Arrays.stream(arr2).min().getAsInt();
        String answer = min + " " + max;
        return answer;
    }
}