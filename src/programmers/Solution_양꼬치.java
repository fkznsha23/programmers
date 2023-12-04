package programmers;

/*
 * 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 
 * 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 
 * 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_양꼬치 {
	public static void main(String[] args) {
		System.out.println(solution(64, 6));
	}
	
	public static int solution(int n, int k) {
		boolean check = check(n, k);
        
		int answer = 0;
        if(check) {
        	answer = getAnswer(n, k);
        }
        
        return answer;
    }

	/*
	 * 0 < n < 1,000
	 * n / 10 ≤ k < 1,000
	 * 서비스로 받은 음료수는 모두 마십니다.
	 */
	private static boolean check(int n, int k) {
		if(n <= 0 || n >= 1000) {
			return false;
		}
		
		int divide = n/10;
		if(divide > k || k >= 1000) {
			return false;
		}
		
		return true;
	}
	
	private static int getAnswer(int n, int k) {
		int lambPrice = 12000;
    	int drink = 2000;
    	int answer = lambPrice*n + drink*k;
    	
    	int divide = n/10;
    	if(divide != 0) {
    		answer -= divide*drink;
    	}
    	
		return answer;
	}
}
