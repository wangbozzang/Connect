package ext;

public class A extends B {
	
	final int a = 100;
	
//	public A() {
//		super(1);
//		System.out.println("A 생성자");
//	}
	
	void a() {
		b();
	}
	void b() {
		System.out.println("b2()");
	}
	
	

}
