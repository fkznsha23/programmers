package programmers;

import java.util.ArrayList;
import java.util.List;

/*
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
 * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_모음제거 {
	private static List<String> VOWEL = List.of("a", "e", "i", "o", "u");

	public static void main(String[] args) {
		System.out.println(solution("nice to meet you"));
	}
	
	public static String solution(String str) {
        String answer = "";
        
        if(checkStr(str)) {
        	List<String> list = changeToList(str);
   			list.removeAll(VOWEL);
        	answer = changeToStr(list);
        }
        
        return answer;
    }

	private static String changeToStr(List<String> list) {
		String answer = "";
		
		for(String s : list) {
			answer += s;
		}
		return answer;
	}

	private static List<String> changeToList(String str) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			list.add(str.substring(i, i+1));
		}
		return list;
	}

	/*
	 * my_string은 소문자와 공백으로 이루어져 있습니다.
	 * 1 ≤ my_string의 길이 ≤ 1,000
	 */
	private static boolean checkStr(String str) {
		if(!str.matches("^[a-z ]*$")) {
			return false;
		}
		
		int size = str.length();
		if(size < 1 || size > 1000) {
			return false;
		}
		
		return true;
	}
}
