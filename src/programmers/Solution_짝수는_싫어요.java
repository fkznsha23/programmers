package programmers;

import java.util.stream.IntStream;

/*
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_짝수는_싫어요 {
	public static void main(String[] args) {
		for(int n : solution(10)) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int n) {
		int[] array = {};
		
		if(checkNum(n)) {
			array = IntStream.rangeClosed(1, n).filter(i -> i%2 != 0).sorted().toArray();
		}
		
	    return array;
	}
	
	// 1 ≤ n ≤ 100
	private static boolean checkNum(int n) {
		if(n < 1 || n > 100) {
			return false;
		}
		
		return true;
	}
}
