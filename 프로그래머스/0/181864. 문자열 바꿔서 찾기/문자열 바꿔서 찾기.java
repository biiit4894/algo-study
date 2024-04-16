class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] arr = myString.split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("A")) {
                arr[i] = "B";
            } else if(arr[i].equals("B")) {
                arr[i] = "A";
            }
        }
        
        String result = "";
        for(String str : arr) {
            result += str;
        }
        
        return (result.contains(pat)) ? 1 : 0;
    }
}