package programmers;

/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 * 		12 ⊕ 3 = 123
 * 		3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 */
public class Solution_더_크게_합치기 {
	public static void main(String[] args) {
		System.out.println(solution(89, 8));
	}
	
	public static int solution(int a, int b) {
        int answer = 0;
        if(checkNum(a) && checkNum(b)) {
        	answer = addNum(a, b) >= addNum(b, a) ? addNum(a, b) : addNum(b, a);
        }
        return answer;
    }
	
	private static int addNum(int a, int b) {
		int answer  = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		return answer;
	}
	
	// 1 ≤ a, b < 10,000
	private static boolean checkNum(int n) {
		if(n < 1 || n >= 10000) {
			return false;
		}
		return true;
	}
}
