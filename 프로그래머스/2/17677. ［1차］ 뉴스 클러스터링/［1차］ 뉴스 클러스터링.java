import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i+1);
            
            if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
             arr1.add(str1.substring(i, i+2).toUpperCase());
            }
            
        }
        
        for(int i = 0; i < str2.length() - 1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i+1);
            
            if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
             arr2.add(str2.substring(i, i+2).toUpperCase());
            }
            
        }
        
        double interNum = 0;
        double unionNum = arr1.size() + arr2.size();
        
        HashMap<String, Integer> countMap1 = new HashMap<>();
        HashMap<String, Integer> countMap2 = new HashMap<>();
        
        for(String str : arr1) {
            countMap1.put(str, countMap1.getOrDefault(str, 0) + 1);
        }
        
        for(String str : arr2) {
            countMap2.put(str, countMap2.getOrDefault(str, 0) + 1);
        }
        
        for(String key : countMap1.keySet()) {
            if(countMap2.containsKey(key)) {
                interNum += Math.min(countMap1.get(key), countMap2.get(key));
            }
        }
        
        unionNum = arr1.size() + arr2.size() - interNum;
        
        if(unionNum == 0) {
            answer = 65536;
        } else {
            answer = (int) Math.floor(interNum / unionNum * 65536);
        }
        return answer;
    }
}
