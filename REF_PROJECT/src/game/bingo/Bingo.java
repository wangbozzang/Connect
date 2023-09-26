package game.bingo;

public class Bingo {
	
	int number;
	
	public Bingo() {
		this.number = (int)(Math.random()*100)+1;
	}

	void getHint(int guestNumber) {
		if ( number > guestNumber ) {
			System.out.println(guestNumber + " 보다 큽니다.");
		}
		if ( number < guestNumber ) {
			System.out.println(guestNumber + " 보다 작습니다.");
		}
	}
}
