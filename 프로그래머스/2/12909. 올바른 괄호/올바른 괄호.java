import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                charStack.push('(');
            } else if (s.charAt(i) == ')') {
                if (charStack.empty()) {
                    answer = false;
                } else {
                    charStack.pop();
                }
            }
        }
        if(!charStack.empty()) {
            answer = false;
        } 
        return answer;
    }
}