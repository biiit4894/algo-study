import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        // s에 담긴 집합을 길이가 짧은 순서대로 정렬하기
        
        ArrayList<Integer> tmp = new ArrayList<>();
        String str1 = s.substring(2, s.length() - 2);
        String[] str2 = str1.split("},\\{");
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
                if(!tmp.contains(x)) {
                    tmp.add(x);
                }
            }
        }
        
        int[] answer = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}