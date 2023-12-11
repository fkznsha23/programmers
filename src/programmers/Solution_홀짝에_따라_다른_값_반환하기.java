package programmers;

import java.util.stream.IntStream;

/*
 * 양의 정수 n이 매개변수로 주어질 때, 
 * n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 */
public class Solution_홀짝에_따라_다른_값_반환하기 {
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static int solution(int n) {
        if(!checkNum(n)) {
        	return 0;
        }
        
        return n%2 != 0 ? IntStream.rangeClosed(1, n).filter(i -> i%2 != 0).sum() : IntStream.rangeClosed(1, n).filter(i -> i%2 == 0).map(i -> (int)Math.pow(i, 2)).sum();
    }

	// 1 ≤ n ≤ 100
	private static boolean checkNum(int n) {
		if(n < 1 || n > 100) {
			return false;
		}
		
		return true;
	}
}
