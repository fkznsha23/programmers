package programmers;

import java.util.stream.IntStream;

/*
 * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 
 * 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 
 * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_머쓱이보다_키_큰_사람 {
	public static void main(String[] args) {
		int[] array = {149, 180, 192, 170};
		System.out.println(solution(array, 167));
	}
	
	public static int solution(int[] array, int height) {
        int answer = 0;
        
        if(checkArray(array, height)) {
        	answer = (int) IntStream.of(array).filter(i -> i > height).count();
        	return answer;
        }
        
        return answer;
    }
	
	/*
	 * 1 ≤ array의 길이 ≤ 100
	 * 1 ≤ height ≤ 200
	 * 1 ≤ array의 원소 ≤ 200
	 */
	private static boolean checkArray(int[] array, int height) {
		if(array.length < 1 || array.length > 100) {
			return false;
		}
		
		for(int num : array) {
			if(!(checkHeight(height) && checkHeight(num))) {
				return false;
			}
		}
			
		return true;
	}
	
	private static boolean checkHeight(int height) {
		if(height >= 1 && height <= 200) {
			return true;
		} 
		return false;
	}
}
