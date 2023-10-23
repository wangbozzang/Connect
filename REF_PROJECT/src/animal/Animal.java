package animal;

public abstract class Animal extends Object {
	String name = "Animal";
	abstract void fly();
	void soundFeed(Animal a) {
		System.out.println(
				a.getName()+" Feed");
	}
	public String getName() {
		return this.name;
	}
}
 