package programmers;

// 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
public class Solution_정수부분 {
	public static void main(String[] args) {
		System.out.println(solution(1.42));
	}
	
	public static int solution(double flo) {
		return checkFlo(flo) ? (int)flo : 0;
    }
	
	// 0 ≤ flo ≤ 100
	private static boolean checkFlo(double f) {
		if(f < 0 || f > 100) {
			return false;
		}
		
		return true;
	}
}
