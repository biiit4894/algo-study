public class Solution {
    public int solution(int n, int k) {
        // 1. 숫자를 k진수로 변환합니다.
        String converted = Integer.toString(n, k);
        
        // 2. 변환된 문자열을 '0'을 기준으로 나누어 각 부분을 소수인지 확인합니다.
        String[] parts = converted.split("0");
        int count = 0;

        for (String part : parts) {
            if (!part.isEmpty() && isPrime(Long.parseLong(part))) {
                count++;
            }
        }

        return count;
    }

    // 주어진 숫자가 소수인지 판별하는 함수
    private boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
