
public class TravelReservationSite {

	int airlinePrice;
	int hotelPrice;
	
	double getTotalPrice(String place) {
		
		double totalPrice = 0;
		
		if ( "LA".equals(place) ) {
			totalPrice = (airlinePrice*1.9) + (hotelPrice*1.5);
		}
		if ( "ENG".equals(place) ) {
			totalPrice = (airlinePrice*2.9) + (hotelPrice*2.5);
		}
		
		return totalPrice;
	}
	
	
	
	int askLAPrice(int laPrice) {
		return laPrice + airlinePrice + hotelPrice;
	}
	
	int askEnglandPrice() {
		return airlinePrice + hotelPrice;
	}
	
}
