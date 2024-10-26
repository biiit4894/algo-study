import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String s) {
        // s에 담긴 집합을 길이가 짧은 순서대로 정렬하기
        
        ArrayList<Integer> answer = new ArrayList<>();
        String str1 = s.substring(2, s.length() - 2);
        String[] str2 = str1.replace("},{", "-").split("-");
        Arrays.sort(str2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        
        for(String str : str2) {
            String[] arr = str.split(",");
            for(String a : arr) {
                int x = Integer.parseInt(a);
                if(!answer.contains(x)) {
                    answer.add(x);
                }
            }
        }
        return answer;
    }
}