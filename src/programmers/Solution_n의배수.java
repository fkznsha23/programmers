package programmers;

/*
 * 정수 num과 n이 매개 변수로 주어질 때, 
 * num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_n의배수 {
	public static void main(String[] args) {
		System.out.println(solution(98, 2));
	}
	
	public static int solution(int num, int n) {
        int answer = 0;
        
        if(checkPram(num, n)) {
        	answer = num%n == 0 ? 1 : 0;
        }
        
        return answer;
    }
	
	/*
	 * 2 ≤ num ≤ 100
	 * 2 ≤ n ≤ 9
	 */
	private static boolean checkPram(int num, int n) {
		if(num < 2 || num > 100) {
			return false;
		}
		
		if(n < 2 || n > 9) {
			return false;
		}
		
		return true;
	}
}
