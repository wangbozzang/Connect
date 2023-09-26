package animal;

import animal.ext.Tiger;

public class Zookeeper {
	
	Animal a;
	
	//먹이를 줍니다.
	Animal feed(Animal a) {
		if (a instanceof Tiger) {
			System.out.println("instanceof Tiger");
			a.soundFeed(a);
		} else {
			a.soundFeed(a);
		}
		return a;
	}

}
