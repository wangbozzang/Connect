package ifc;

public class CTest {

	public static void main(String[] args) {
		A a = new C();
		B b = new C();
//		D d = new C();
		C c = new C();
		ct1(c);
	}
	
	static void ct1(A a) {
		System.out.println("Hello World!");
	}

}
