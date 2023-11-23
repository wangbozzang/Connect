import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		Optional opt = Optional.of(null);
		boolean is = opt.isPresent();
		System.out.println();
		
	}

}
