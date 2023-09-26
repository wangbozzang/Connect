
public class CalculatorTester {
	
	void test() {
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(true);
		System.out.println('A');
		System.out.println("A");
		System.out.println(new Calculator());
				
		Calculator cal2 = new Calculator(5000);
		cal2.add(1, 2);
		Calculator cal3 = new Calculator();
		cal3.add(2, 3);
		
		System.out.println(cal2.getSum());
		System.out.println(cal3.getSum());
	}

}
