package game.starbucks;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아메리카노 한잔당 가격을 입력하시오.");
		int price = scanner.nextInt();
		
		Starbucks sb = new Starbucks(price, 0);
		
		Guest guest = new Guest(100000000);
		
		sb.order(guest);
		
		System.out.println("스벅 매출:"+sb.money);
		System.out.println("손님 지갑:"+guest.money);
		
		
	}

}
