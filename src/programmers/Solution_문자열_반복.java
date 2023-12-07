package programmers;

/*
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 
 * solution("hello", 3)
 * -> "hhheeellllllooo"
 */
public class Solution_문자열_반복 {
	public static void main(String[] args) {
		System.out.println(solution("SoLu", 3));
	}
	public static String solution(String str, int n) {
        String answer = "";
        
        if(checkStr(str, n)) {
        	for(int i = 0; i < str.length(); i++) {
//        		String[] array = str.split("");
//        		answer += array[i].repeat(n);
        		for(int j = 1; j <= n; j++) {
        			answer += str.charAt(i);
        		}
        	}
        }
        
        return answer;
    }
	
	/*
	 * 2 ≤ my_string 길이 ≤ 5
	 * 2 ≤ n ≤ 10
	 * "my_string"은 영어 대소문자로 이루어져 있습니다.
	 */
	private static boolean checkStr(String str, int n) {
		int size = str.length();
		if(size < 2 || size > 5) {
			return false;
		}
		
		if(n < 2 || n > 10) {
			return false;
		}
		
		if(!str.matches("^[A-Za-z]*$")) {
			return false;
		}
		
		return true;
	}
}
