
public class Calculator {
	
	static int SUM;
	
	int price;
	String brand;
	
	Calculator(int price){
		this("일산");
		this.price = price;
	}
	
	Calculator(String brand){
		this.brand = brand;
	}
	
	static int getPrice() {
		return price;
	}
	
	int add(int a, int b, int c) {
		SUM = a + b + c;
		return SUM;
	}
	
	int del(int a, int b) {
		SUM = a - b;
		return SUM;
	}

}
