package programmers;

import java.util.List;
import java.util.stream.Collectors;

/*
 * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. 
 * myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 
 * pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
 */
public class Solution_문자열_바꾸기 {
	public static void main(String[] args) {
		System.out.println(solution("ABBAA", "AABB"));
	}
	
	public static int solution(String str, String pat) {
        int answer = 0;
        
        if(checkPram(str, pat)) {
        	String newStr = "";
        	List<Character> list = str.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        	for(Character c : list) {
        		newStr += c == 'A' ? 'B' : 'A';
        	}
        	
        	if(newStr.contains(pat)) {
        		return 1;
        	}
        	
//        	str = str.replace("A", "a").replace("B", "b").replace("b", "A").replace("a", "B");
//        	answer = str.contains(pat) ? 1 : 0;
        }
        
        return answer;
    }

	/*
	 * 1 ≤ str의 길이 ≤ 100
	 * 1 ≤ pat의 길이 ≤ 10
	 * 		str과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.
	 */
	private static boolean checkPram(String str, String pat) {
		int sizeStr = str.length();
		if(sizeStr < 1 || sizeStr > 100) {
			return false;
		}
		
		int sizePat = pat.length();
		if(sizePat < 1 || sizePat > 10) {
			return false;
		}
		
		int countStr = (int) str.chars().mapToObj(c -> (char)c).filter(c -> c == 'A' || c == 'B').count();
		int countPat = (int) pat.chars().mapToObj(c -> (char)c).filter(c -> c == 'A' || c == 'B').count();
		if(countStr != sizeStr && countPat != sizePat) {
			return false;
		}
		
		return true;
	}
}
