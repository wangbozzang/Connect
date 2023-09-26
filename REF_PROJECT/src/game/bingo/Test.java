package game.bingo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Bingo bingo = new Bingo();
		Scanner scanner = new Scanner(System.in);
		int guestNumber = 0;
		while ( true ) {
			System.out.println("1~100까지의 숫자중 하나를 입력하시오.");
			guestNumber = scanner.nextInt();
			if ( bingo.number == guestNumber ) {
				System.out.println("빙고");
				break;
			}
			bingo.getHint(guestNumber);
		}
	}

}
