package game.starbucks;

import java.util.Scanner;

public class StartbucksTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이스 아메리카노 한잔당 가격을 입력하시오.");
		int priceOfIceAmericano = scanner.nextInt();
		
		System.out.println("수량을 입력하시오.");
		int count = scanner.nextInt();
		
		int totalPrice = priceOfIceAmericano * count;
		
		System.out.println("총액은 " + totalPrice + "입니다.");
	}

}
