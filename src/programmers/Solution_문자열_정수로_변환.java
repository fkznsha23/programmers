package programmers;

/*
 * 숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_문자열_정수로_변환 {
	public static void main(String[] args) {
		System.out.println(solution("575"));
	}
	
	public static int solution(String str) {
        int answer = 0;
        
        if(checkStr(str)) {
        	answer = Integer.valueOf(str);
        }
        
        return answer;
    }

	/*
	 * 1 ≤ n_str ≤ 5
	 * n_str은 0부터 9까지의 정수 문자로만 이루어져 있습니다.
	 */
	private static boolean checkStr(String str) {
		if(!str.matches("^[0-9]*$")) {
			return false;
		}
		
		if(str.length() < 1 || str.length() > 5) {
			return false;
		}
		
		return true;
	}
}
