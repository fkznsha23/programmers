package programmers;

import java.util.Arrays;

/*
 * 문자열 str과 정수 배열 array가 매개변수로 주어집니다. 
 * str의 array의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class Solution_글자_이어붙여_문자열_만들기 {
	public static void main(String[] args) {
		int[] array = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		System.out.println(solution("cvsgiorszzzmrpaqpe", array));
	}
	
	public static String solution(String str, int[] array) {
        String answer = "";
        
        if(checkNum(str, array)) {
        	for(int n : array) {
        		answer += str.charAt(n);
        	}
        }
        
        return answer;
    }
	
	/*
	 * 1 ≤ my_string의 길이 ≤ 1,000
	 * my_string의 원소는 영소문자로 이루어져 있습니다.
	 * 1 ≤ index_list의 길이 ≤ 1,000
	 * 0 ≤ index_list의 원소 < my_string의 길이
	 */
	private static boolean checkNum(String str, int[] array) {
		if(!(checkSize(str.length()) && checkSize(array.length))) {
			return false;
		}
		
		if(!str.matches("^[a-z]*$")) {
			return false;
		}
		
		int count = (int) Arrays.stream(array).filter(i -> i >= 0 && i < str.length()).count();
		if(count != array.length) {
			return false;
		}
		
		return true;
	}

	private static boolean checkSize(int length) {
		if(length < 1 || length > 1000) {
			return false;
		}
		return true;
	}
}
