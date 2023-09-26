
public class Restaurant {

	String mainMenu;
	int price;

	String askMainMenu() {
		return this.mainMenu;
	}

	int askPrice(int amount) {
		return price * amount;
	}

}
