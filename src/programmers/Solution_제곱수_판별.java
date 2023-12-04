package programmers;

/*
 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
 * 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_제곱수_판별 {
	public static void main(String[] args) {
		System.out.println(solution(144));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        if(checkNum(n)) {
        	int square = 0;
        		for(int i = 1; square < n; i++) {
        		square = i*i;
        		if(square == n) {
        			answer = 1;
        			return answer;
        		}
        	}
        }
        answer = 2;
        return answer;
    }

	// 1 ≤ n ≤ 1,000,000
	private static boolean checkNum(int n) {
		if(n >= 1 && n <= 1000000) {
			return true;
		}
		return false;
	}
}
