package programmers;

import java.util.stream.IntStream;

/*
 * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 
 * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_중앙값_구하기 {
	public static void main(String[] args) {
		int[] array = {9, -1, 0};
		System.out.println(solution(array));
	}
	
	public static int solution(int[] array) {
        int answer = 0;
        
        if(checkArray(array)) {
        	int[] newArray = IntStream.of(array).sorted().toArray();
        	int count = newArray.length/2;
        	answer = newArray[count];
        }
        
        return answer;
    }

	/*
	 * array의 길이는 홀수입니다.
	 * 0 < array의 길이 < 100
	 * -1,000 < array의 원소 < 1,000
	 */
	private static boolean checkArray(int[] array) {
		int size = array.length;
		if(size%2 == 0) {
			return false;
		}
		
		if(size <= 0 || size >= 100) {
			return false;
		}
		
		int count = (int) IntStream.of(array).filter(i -> i > - 1000)
									   .filter(i -> i < 1000)
									   .count();
		if(count != size) {
			return false;
		}
		
		return true;
	}
}
