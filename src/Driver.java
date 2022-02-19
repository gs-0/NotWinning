
public class Driver {

	public static void main(String[] args) {
		Guess test = new Guess();
		System.out.println(test.takeWord());
		test.promptUser();
		System.out.println(test.compareWords());
	}

}
