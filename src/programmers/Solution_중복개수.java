package programmers;

/*
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, 
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_중복개수 {
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 4, 5};
		System.out.println(solution(array, 1));
	}
	
	public static int solution(int[] array, int n) {
        int answer = 0;
        
        if(checkPraram(array, n)) {
        	for(int num : array) {
        		if(num == n) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
	
	/*
	 * 1 ≤ array의 길이 ≤ 100
	 * 0 ≤ array의 원소 ≤ 1,000
	 * 0 ≤ n ≤ 1,000
	 */
	private static boolean checkPraram(int[] array, int n) {
		if(checkArray(array) && checkNum(n)) {
			return true;
		}
		return false;
	}

	private static boolean checkArray(int[] array) {
		int size = array.length;
		if(size < 1 || size > 100) {
			return false;
		}
		
		for(int num : array) {
			if(!checkNum(num)) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkNum(int n) {
		if(n < 0 || n > 1000) {
			return false;
		}
		return true;
	}
}
