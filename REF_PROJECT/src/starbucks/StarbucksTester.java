package starbucks;

public class StarbucksTester {

	public static void main(String[] args) {

		Starbucks starbucks = 
				Starbucks.getIntance();
		
		Guest guest = new Guest(new Money());
		Guest guest2 = new Guest(new Money());
		Guest guest3 = new Guest(new Money());
		
		guest.order(starbucks);
		
	}

}
