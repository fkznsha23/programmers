package programmers;

/*
 * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 
 * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_아이스아메리카노 {
	private final static int ICE_AMERICANO_PRICE = 5500;
	
	public static void main(String[] args) {
		System.out.println(solution(15000));
	}
	
	public static int[] solution(int money) {
        int[] answer = new int[2];
        
        if(checkMoney(money)) {
       		answer[0] = money/ICE_AMERICANO_PRICE;
       		answer[1] = money%ICE_AMERICANO_PRICE;
        }
        
        return answer;
    }
	
	// 0 < money ≤ 1,000,000
	private static boolean checkMoney(int money) {
		if(money <= 0 || money > 1000000) {
			return false;
		}
		return true;
	}
}
