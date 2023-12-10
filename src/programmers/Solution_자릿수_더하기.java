package programmers;

/*
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 */
public class Solution_자릿수_더하기 {
	public static void main(String[] args) {
		System.out.println(solution(1234));
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        if(checkNum(n)) {
        	answer = String.valueOf(n).chars().mapToObj(c -> (char)c).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
        }
        
        return answer;
    }

	// 0 ≤ n ≤ 1,000,000
	private static boolean checkNum(int n) {
		if(n < 0 || n > 1000000) {
			return false;
		}
		
		return true;
	}
}
