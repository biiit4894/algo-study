import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        // 1, 1
        // 3, 2
        // 4, 2
        // 4, 3
        Arrays.sort(weights);
        /*
        if weight[i] <= weight[j]
        1. weight[i] == weight[j]
        2. weight[i] * 2 == weight[j]
        3. weight[i] * 3 == weight[j] * 2
        4. weight[i] * 4 == weight[j] * 3
        */
        
        /* 위의 조건은 이렇게도 표현 가능
        if weight[i] <= weight[j]
        1. weight[i] == weight[j]
        2. weight[i] == weight[j] / 2
        3. weight[i] == weight[j] * 2 / 3
        4. weight[i] == weight[j] * 3 / 4
        */
        
        // for(int i = 0; i < weights.length - 1; i++) {
        //     for(int j = i + 1; j < weights.length; j++) {
        //         if(weights[i] == weights[j] ||
        //           weights[i] * 2 == weights[j] ||
        //           weights[i] * 3 == weights[j] * 2 ||
        //           weights[i] * 4 == weights[j] * 3) {
        //             answer++;
        //         }
        //     }
        // }
        
        // 100억번 연산 수행 -> 시간 초과
        
        // O(1)로 바꾸기 위해서는..hash를 쓰는수밖에 -> O(n)

        Map<Integer, Integer> map = new HashMap<>();
        for(int weight : weights) {
            if(map.containsKey(weight)) answer += map.get(weight);
            if(weight % 2 == 0 && map.containsKey(weight / 2)) answer += map.get(weight / 2);
            if(weight % 3 == 0 && map.containsKey(weight * 2 / 3)) answer += map.get(weight * 2 / 3);
            if(weight % 4 == 0 && map.containsKey(weight * 3 / 4)) answer += map.get(weight * 3 / 4);
            map.put(weight, map.getOrDefault(weight, 0) + 1);
        
        }
        
        return answer;
    }
}