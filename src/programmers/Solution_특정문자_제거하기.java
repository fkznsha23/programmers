package programmers;

import java.util.ArrayList;
import java.util.List;

/*
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_특정문자_제거하기 {
	public static void main(String[] args) {
		System.out.println(solution("abcd", "d"));
	}
	
	public static String solution(String my_string, String letter) {
        boolean check = checkStr(my_string, letter);
		
		String answer = "";
		if(check) {
			List<String> list = changeList(my_string);
			answer = remove(list, letter);
		}
        return answer;
    }

	private static List<String> changeList(String my_string) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < my_string.length(); i++) {
			list.add(my_string.substring(i, i + 1));
		}
		return list;
	}

	private static String remove(List<String> list, String letter) {
		String answer = "";
		for(String str : list) {
			if(!str.equals(letter)) {
				answer += str;
			}
		}
		return answer;
	}

	/*
	 * 1 ≤ my_string의 길이 ≤ 100
	 * letter은 길이가 1인 영문자입니다.
	 * my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
	 * 대문자와 소문자를 구분합니다.
	 */
	private static boolean checkStr(String my_string, String letter) {
		if(checkSize(my_string, letter) && checkContent(my_string, letter)) {
			return true;
		}
		return false;
	}

	private static boolean checkSize(String my_string, String letter) {
		int sizeStr = my_string.length();
		if(sizeStr < 1 || sizeStr > 100) {
			return false;
		}
		
		int sizeLetter = letter.length();
		if(sizeLetter != 1) {
			return false;
		}
		
		return true;
	}

	private static boolean checkContent(String my_string, String letter) {
		if(checkEng(my_string) && checkEng(letter)) {
			return true;
		}
		return false;
	}

	private static boolean checkEng(String str) {
		if(str.matches("^[a-zA-Z]*$")) {
			return true;
		}
		return false;
	}
}
