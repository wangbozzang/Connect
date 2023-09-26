package game.starbucks;

import java.util.Scanner;

public class Starbucks {
	
	Scanner scanner = new Scanner(System.in);

	int priceOfIceAme;
	int money;
	
	public Starbucks(int priceOfIceAme, int money) {
		this.priceOfIceAme = priceOfIceAme;
		this.money = money;
	}
	
	//총액 계산해서 리턴해주는 메소드
	int getTotal(int count) {
		return priceOfIceAme * count;
	}
	
	void order(Guest guest) {
		System.out.println("몇 잔 드릴까요?");
		int count = scanner.nextInt();
		
		int total = getTotal(count);
		System.out.println("손님! " + total + " 나왔습니다.");
		
		guest.money = guest.money - total;
		
		this.money = this.money + total;
	}
	
	
	
}
