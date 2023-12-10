package programmers;

/*
 * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, 
 * flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
 */
public class Solution_flag에_따라_다른_값_반환하기 {
	public static void main(String[] args) {
		System.out.println(solution(-4, 7, false));
	}
	
	public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if(checkNum(a) && checkNum(b)) {
        	answer = flag ? a+b : a-b;
        }
        
        return answer;
    }
	
	// -1,000 ≤ a, b ≤ 1,000
	private static boolean checkNum(int num) {
		if(num < -1000 || num > 1000) {
			return false;
		}
		
		return true;
	}
}
