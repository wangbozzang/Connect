package game.everland;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List tecketList = new ArrayList();
		int total = 0;
		EverlandTicket et = null;
		for ( int i = 1 ; i < 1001 ; i++ ) {
			et = makeET(i);
			total += et.price;
			System.out.println(
					"티켓번호:"+et.no
					+ ",종류:"+et.type
					+ ",입장료:"+et.price
					+ ",누적:"+total);
			tecketList.add(et);
		}
		System.out.println();
	}
	
	static EverlandTicket makeET(int i) {
		if ( (0 == i % 4) && (0 == i % 7) ) {
			return new EverlandTicket(i, "빅이벤트", 0);
		}
		if ( 0 == i % 4 ) {
			return new EverlandTicket(i, "청소년", 35000);
		}
		if ( 0 == i % 7 ) {
			return new EverlandTicket(i, "미취학", 18000);
		}
		return new EverlandTicket(i, "성인", 50000);
	}
	
	
	
	
	
	
	
	
	
	
	

}
