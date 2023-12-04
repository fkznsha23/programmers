package programmers;

import java.util.regex.Pattern;

/*
	문자열 str1, str2가 매개변수로 주어집니다. 
	str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
*/
public class Solution_문자열_안의_문자열 {
	public static void main(String[] args) {
		System.out.println(solution("ssddd11ss22", "ddd11"));
	}
	
	public static int solution(String str1, String str2) {
		boolean check = check(str1, str2);
        if(check) {
        	boolean inStr2 = str1.contains(str2);
        	if(inStr2) {
        		return 1;
        	}
        }
        return 2;
    }
	
	private static boolean check(String str1, String str2) {
		boolean checkLength1 = checkLength(str1);
		boolean checkLength2 = checkLength(str2);
		boolean checkText = checkText(str1, str2);
		if(!checkLength1 || !checkLength2 || !checkText) {
			return false;
		}
		return true;
	}

	private static boolean checkText(String str1, String str2) {
		if(Pattern.matches("^[a-zA-Z0-9]*", str1) && Pattern.matches("^[a-zA-Z0-9]*", str2)) {
			return true;
		}
		return false;
	}

	private static boolean checkLength(String str) {
		if(str.length() < 1 && str.length() > 100) {
			return false;
		}
		return true;
	}
}
