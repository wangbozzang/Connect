package game.rps;

public class Test {

	public static void main(String[] args) {

		System.out.println("가위바위보 게임에 오신걸 환영합니다.");
		
		RockPaperScissors rps = new RockPaperScissors();
		rps.setGuestNumber();
		rps.printNumber();
		rps.checkWinner();
	}

	/*
	 * (1:가위,2:바위,3:보)
	 * 
	 */
}
