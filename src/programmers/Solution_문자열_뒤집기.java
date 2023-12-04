package programmers;

public class Solution_문자열_뒤집기 {
	public static void main(String[] args) {
		System.out.println(solution("바보"));
	}
	
	public static String solution(String my_string) {
        String answer = "";
        
        boolean check = checkText(my_string);
        if(check) {
        	StringBuilder sb = new StringBuilder(my_string);
        	answer = sb.reverse().toString();
        }
        return answer;
    }
	
	private static boolean checkText(String my_string) {
		if(my_string.length() < 1 && my_string.length() > 1000) {
			return false;
		}
		return true;
	}
}
