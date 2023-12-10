package programmers;


// 문자열 str과 정수 k가 주어질 때, str을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Solution_문자열_곱하기 {
	public static void main(String[] args) {
		System.out.println(solution("love", 10));
	}
	
	public static String solution(String str, int k) {
        String answer = "";
        
        if(checkPram(str, k)) {
        	for(int i = 1; i <= k; i++) {
        		answer += str;
        	}
//        	return str.repeat(k);
        }
        
        return answer;
    }
	
	/*
	 * 1 ≤ my_string의 길이 ≤ 100
	 * my_string은 영소문자로만 이루어져 있습니다.
	 * 1 ≤ k ≤ 100
	 */
	private static boolean checkPram(String str, int k) {
		if(!(checkContent(str.length()) && checkContent(k))) {
			return false;
		}
		
		if(!str.matches("^[a-z]*$")) {
			return false;
		}
		
		return true;
	}

	private static boolean checkContent(int n) {
		if(n < 1 || n > 100) {
			return false;
		}
		return true;
	}
}
