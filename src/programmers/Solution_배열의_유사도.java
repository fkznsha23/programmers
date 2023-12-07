package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 두 배열이 얼마나 유사한지 확인해보려고 합니다. 
 * 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_배열의_유사도 {
	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		System.out.println(solution(s1, s2));
	}
	
	public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        if(checkArrays(s1) && checkArrays(s2)) {
        	Set<String> set1 = changeSet(s1);
        	answer = (int) Arrays.stream(s2).filter(set1::contains).count();
        }
        
        return answer;
    }

	private static Set<String> changeSet(String[] s) {
		return new HashSet<>(Arrays.asList(s));
	}

	/*
	 * 1 ≤ s1, s2의 길이 ≤ 100
	 * 1 ≤ s1, s2의 원소의 길이 ≤ 10
	 * s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
	 * s1과 s2는 각각 중복된 원소를 갖지 않습니다.
	 */
	private static boolean checkArrays(String[] s) {
		if(s.length < 1 || s.length > 100) {
			return false;
		}
		
		for(String text : s) {
			if(text.length() < 1 || text.length() > 10) {
				return false;
			}
			if(!text.matches("^[a-z]*$")) {
				return false;
			}
		}
		if(!NotOverlap(s)) {
			return false;
		}
		
		return true;
	}

	private static boolean NotOverlap(String[] s) {
		int size = s.length;
		Set<String> set = changeSet(s);
		
		if(size != set.size()) {
			return false;
		}

		return true;
	}
}
