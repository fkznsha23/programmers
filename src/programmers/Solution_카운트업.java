package programmers;

import java.util.stream.IntStream;

/*
 * 정수 start_num와 end_num가 주어질 때, 
 * start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_카운트업 {
	public static void main(String[] args) {
		for(int n : solution(3, 10)) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int start, int end) {
		if(!checkPram(start, end)) {
			return null;
		}
		
		return IntStream.rangeClosed(start, end).toArray();
    }

	// 0 ≤ start_num ≤ end_num ≤ 50
	private static boolean checkPram(int start, int end) {
		if(start < 0 || end < start || end > 50) {
			return false;
		}
		
		return true;
	}
}
