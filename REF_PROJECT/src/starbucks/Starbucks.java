package starbucks;

public class Starbucks {
	
	private static Starbucks sb;
	
	private Starbucks() {
		
	}
	
	public static Starbucks getIntance() {
		if ( null == sb ) {
			sb = new Starbucks();
		}
		return sb;
	}

	Coffee sell(Money money){
		return new Coffee();
	}
}
