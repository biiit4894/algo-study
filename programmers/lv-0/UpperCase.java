class UpperCase {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            answer += Character.toUpperCase(c);
        }
        
        return answer;
    }
}