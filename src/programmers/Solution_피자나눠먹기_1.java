package programmers;

/*
 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 
 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 */
public class Solution_피자나눠먹기_1 {
	private final static int NUMBER_PIZZA = 7;
	
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
		int answer = 0;

		if(checkNum(n)) {
			int rest = n%NUMBER_PIZZA;
			answer = n/NUMBER_PIZZA;
			if(rest != 0) {
				answer += 1;
			}
		}
		
        return answer;
    }
	
	// 1 ≤ n ≤ 100
	private static boolean checkNum(int n) {
		if(n >= 1 && n <= 100) {
			return true;
		}
		
		return false;
	}
}
