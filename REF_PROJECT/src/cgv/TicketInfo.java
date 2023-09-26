package cgv;

public class TicketInfo {
	//극장명, 티켓번호, 영화제목, 상영일시, 상영관
	static String CINEMA_NAME = "CGV 일산";
	int ticketNo;
	String movieTitle;
	String movieDate;
	int movieRoom;
	
	public TicketInfo(String movieTitle){
		this(1);
		this.movieTitle = movieTitle;
	}
	public TicketInfo(int movieRoom){
		this.movieRoom = movieRoom;
	}
	
	int getTicketNo() {
		return ++ticketNo;
	}
	int getTicketNo(int ticketNo) {
		return ++ticketNo;
	}
	

}
