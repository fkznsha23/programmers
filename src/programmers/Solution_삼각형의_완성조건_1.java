package programmers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 * 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 
 * 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
 * 
 * 1. 가장 큰 숫자 찾기
 * 2. 그 외 숫자 합이 가장 큰 숫자보다 커야한다.
 */
public class Solution_삼각형의_완성조건_1 {
	public static void main(String[] args) {
		int[] sides = {1, 2, 2};
		
		System.out.println(solution(sides));
	}
	
	public static int solution(int[] sides) {
		if(checkSides(sides)) {
			int max = IntStream.of(sides).max().getAsInt();
			List<Integer> list = IntStream.of(sides).boxed().collect(Collectors.toList());
			list.remove(list.indexOf(max));
			int sum = 0;
			for(int num : list) {
				sum += num;
			}
			
			if(sum > max) {
				return 1;
			}
		}
		
        return 2;
    }
	
	/*
	 * sides의 원소는 자연수입니다.
	 * sides의 길이는 3입니다.
	 * 1 ≤ sides의 원소 ≤ 1,000
	 */
	private static boolean checkSides(int[] sides) {
		if(sides.length == 3) {
			for(int num : sides) {
				if(num >= 1 && num <= 1000) {
					return true;
				}
			}
		}
			
		return false;
	}
}
