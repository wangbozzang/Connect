package twentymount;

import java.math.MathContext;
import java.util.Scanner;

@SuppressWarnings("all")

public class Test {

	public static void main(String[] args) {

		int comNum = (int) (Math.random() * 100) + 1;

		int guestNum;

		int i;

	
		Scanner scanner = new Scanner(System.in);

		for (i = 1; i <= 20; i++) {

			System.out.println("숫자를 입력하시오.");

			guestNum = scanner.nextInt();

			System.out.println("20번 중 :" + i + "번 하셨습니다.");
			
			if (comNum == guestNum) {
				System.out.println("정답입니다.");
				break;
			} else if (comNum < guestNum) {
				System.out.println("값보다 큽니다.");
			} else if (comNum > guestNum) {
				System.out.println("값보다 작습니다.");
			}
		}
	}
}
