package programmers;

import java.util.List;

/*
 * 문자열 배열 strlist가 매개변수로 주어집니다. 
 * strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 */
public class Solution_배열_원소의_길이 {
	public static void main(String[] args) {
		String[] strList = {"kagami", "taiga", "babo", "babo"};
		System.out.println(solution(strList));
	}
	public static int[] solution(String[] strArray) {
		List<String> strList = List.of(strArray);
		boolean check = checkStrList(strList);
        int[] answer = {};
        
        if(check) {
        	answer = getAnswer(strList);
        }
        return answer;
    }
	
	private static int[] getAnswer(List<String> strList) {
		int len = strList.size();
		int[] answer = new int[len];
		
		for(int i = 0; i < len; i++) {
			answer[i] = strList.get(i).length();
		}
		
		return answer;
	}
	/*
	 * 1 ≤ strlist 원소의 길이 ≤ 100
	 * strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
	*/
	private static boolean checkStrList(List<String> strList) {
		for(String i : strList) {
			if(checkContent(i) && checkLength(i)){
				return true;
			}
		}
		
//		왜 필터를 쓰면 문제 제출에서 실패로 뜰까?
//		Stream<String> strStream = strList.stream();
//		int count = (int) strStream.filter(i -> checkContent(i))
//								   .filter(i -> checkLength(i))
//								   .count();
//		System.out.println(count);
//		if(count == strList.size()) {
//			return true;
//		}
		
		return false;
	}
	
	private static boolean checkContent(String text) {
		if(text.matches("^[a-zA-Z!@#$%^&*()_+=\\-{}\\[\\]:;<>,.?\\/]*$")) {
			return true;
		}
		return false;
	}
	
	private static boolean checkLength(String text) {
		if(text.length() >= 1 && text.length() <= 50) {
			return true;
		}
		return false;
	}
}
