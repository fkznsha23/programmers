package programmers;
/*
 * 1 ≤ myString의 길이 ≤ 100,000
 * myString은 알파벳으로 이루어진 문자열입니다.
 */

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution_대문자로_변환 {
	public static void main(String[] args) {
		System.out.println(solution("adond"));
	}
	
	public static String solution(String myString) {
        String answer = "";
        
        boolean check = checkText(myString);
        if(check) {
        	Stream<String> stream = Stream.of(myString).map(String::toUpperCase);
        	answer = stream.collect(Collectors.joining());
        }
        
        return answer;
    }
	
	private static boolean checkText(String myString) {
		if(myString.length() < 1 && myString.length() > 100000) {
			return false;
		}
		
		if(!Pattern.matches("^[a-zA-Z]*$", myString)) {
			return false;
		}
		
		return true;
	}
}
