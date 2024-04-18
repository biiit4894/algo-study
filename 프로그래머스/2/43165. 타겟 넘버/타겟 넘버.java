class Solution {
    int answer = 0;
    
    public void dfs(int[] numbers, int target, int idx, int sum) {
        if(idx == numbers.length) {
            if(target == sum) answer++;
            return;
        }
        
        dfs(numbers, target, idx + 1, sum + numbers[idx]);
        dfs(numbers, target, idx + 1, sum - numbers[idx]);
        /*
        1. idx = 0, numbers[idx] = 4
        -> 다음 Dfs 함수가호출됨
        2. idx = 1, numbers[idx] = 1, sum = 4
        -> 다음 함수 호출
        ...
        ...
        3. idx = 2 -> numbers[idx] = 2 sum 5
        4. idx = 3 -> ...
        5. idx = 4 -> sum = 
        */
        
    }
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
}