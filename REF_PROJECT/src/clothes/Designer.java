package clothes;

public class Designer {

	public static void main(String[] args) {
		Clothes up = new Clothes(
				true
				, 100
				, "쟈켓"
				, 10000000);
		up.setColor("Black");
		
		Clothes down = new Clothes(
				false
				, 30
				, "슬랙스"
				, 5000000);
		down.setColor("Red");
		
		System.out.println(
				up.getClothesInfo());
		System.out.println(
				down.getClothesInfo());
		
		
	}
	
}
