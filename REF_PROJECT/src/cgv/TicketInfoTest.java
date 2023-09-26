package cgv;

public class TicketInfoTest {

	public static void main(String[] args) {

		int i = 100;
		
		TicketInfo ti = new TicketInfo("아바타");
//		int ticketNo = ti.getTicketNo(7);
//		System.out.println(ticketNo);
//		ti.ticketNo = ticketNo;
		ti.ticketNo = ti.getTicketNo(7);
		ti.movieDate = "2023년9월13일 12시50분";
		
		System.out.println("극장명:" + TicketInfo.CINEMA_NAME);
		System.out.println("티켓번호:" + ti.ticketNo);
		System.out.println("영화제목:" + ti.movieTitle);
		System.out.println("상영일시:" + ti.movieDate);
		System.out.println("상영관:" + ti.movieRoom);
	}

}
