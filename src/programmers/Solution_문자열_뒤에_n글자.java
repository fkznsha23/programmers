package programmers;

/*
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
 * my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 전체 길이 - n = 시작 인덱스
 */
public class Solution_문자열_뒤에_n글자 {
	public static void main(String[] args) {
		System.out.println(solution("ProgrammerS123", 11));
	}
	
	public static String solution(String str, int n) {
        String answer = "";
        
        if(checkStr(str, n)) {
        	int size = str.length();
        	int start = size - n;
        	answer = str.substring(start);
        }
        
        return answer;
    }
	
	/*
	 * my_string은 숫자와 알파벳으로 이루어져 있습니다.
	 * 1 ≤ my_string의 길이 ≤ 1,000
	 * 1 ≤ n ≤ my_string의 길이
	 */
	private static boolean checkStr(String str, int n) {
		if(!str.matches("^[a-zA-Z0-9]*$")) {
			return false;
		}
		
		int size = str.length();
		if(size < 1 || size > 1000) {
			return false;
		}
		
		if(!checkNum(n, size)) {
			
		}
		
		return true;
	}

	private static boolean checkNum(int n, int size) {
		if(n < 1 || n > size) {
			return false;
		}
		
		return true;
	}
}
