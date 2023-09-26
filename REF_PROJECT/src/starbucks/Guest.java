package starbucks;

public class Guest {
	
	Money money;
	Coffee coffee;
	
	Guest(Money money){
		this.money = money;
	}

	void order(Starbucks starbucks){
		coffee = starbucks.sell(money);
	}
}
