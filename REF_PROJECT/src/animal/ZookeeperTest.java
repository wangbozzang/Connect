package animal;

import animal.ext.Horse;
import animal.ext.Tiger;

public class ZookeeperTest {
	public static void main(String[] args) {
		new Zookeeper().feed(new Tiger());
	}

}
