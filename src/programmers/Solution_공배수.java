package programmers;

import java.util.stream.IntStream;

/*
 * 정수 number와 n, m이 주어집니다. 
 * number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_공배수 {
	public static void main(String[] args) {
		System.out.println(solution(55, 10, 5));
	}
	
	public static int solution(int number, int n, int m) {
        int answer = 0;
        
        if(checkNum(number, n, m)) {
        	answer = (int) IntStream.of(number).filter(num -> num%n == 0).filter(num -> num%m == 0).count();
        	// answer = number % n == 0 && number % m == 0 ? 1 : 0;
        }
        
        return answer;
    }
	
	/*
	 * 10 ≤ number ≤ 100
	 * 2 ≤ n, m < 10
	 */
	private static boolean checkNum(int number, int n, int m) {
		if(number < 10 || number > 100) {
			return false;
		}
		
		if(!(checkN(n) && checkN(m))) {
			return false;
		}
		
		return true;
	}

	private static boolean checkN(int n) {
		if(n < 2 || n >= 10) {
			return false;
		}
		return true;
	}
}
