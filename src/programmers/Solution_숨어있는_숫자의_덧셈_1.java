package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 문자열 my_string이 매개변수로 주어집니다. 
 * my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_숨어있는_숫자의_덧셈_1 {
	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
	}
	
	public static int solution(String str) {
        int answer = 0;
        
        if(checkStr(str)) {
        	List<String> list = changeList(str);
        	List<String> numList = list.stream().filter(i -> i.matches("^[0-9]")).collect(Collectors.toList());
        	answer = numList.stream().mapToInt(Integer::parseInt).sum();
        	// answer = str.chars().mapToObj(i -> (char)i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
        }
        
        return answer;
    }
	
	private static List<String> changeList(String str) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			list.add(str.substring(i, i+1));
		}
		return list;
	}

	/*
	 * 1 ≤ my_string의 길이 ≤ 1,000
	 * my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
	 */
	private static boolean checkStr(String str) {
		int size = str.length();
		if(size < 1 || size > 1000) {
			return false;
		}
		
		if(!str.matches("^[a-zA-Z0-9]*$")) {
			return false;
		}
		
		return true;
	} 
}
