package programmers;

/*
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
 * my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class Solution_문자열_앞의_n글자 {
	public static void main(String[] args) {
		System.out.println(solution("hellohellohello", 5));
	}
	
	public static String solution(String my_string, int n) {
		boolean check = checkParam(my_string, n);
		
        String answer = "";
        if(check) {
        	answer = my_string.substring(0, n);
        }
        return answer;
    }

	/*
	 * my_string은 숫자와 알파벳으로 이루어져 있습니다.
	 * 1 ≤ my_string의 길이 ≤ 1,000
	 * 1 ≤ n ≤ my_string의 길이
	 */
	private static boolean checkParam(String my_string, int n) {
		if(checkContent(my_string) && checkSize(my_string, n)) {
			return true;
		}
		
		return false;
	}

	private static boolean checkContent(String my_string) {
		if(my_string.matches("^[a-zA-Z0-9]*$")) {
			return true;
		}
		return false;
	}

	private static boolean checkSize(String my_string, int n) {
		int strSize = my_string.length();
		if(strSize < 1 || strSize > 1000) {
			return false;
		}
		
		if(n < 1 || n > strSize) {
			return false;
		}
		
		return true;
	}
}
