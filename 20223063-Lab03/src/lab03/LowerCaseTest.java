package lab03;

public class LowerCaseTest {

	public static void main(String[] args) {
		String TestCase = "This is Test";
		String smallTestString = TestCase.toLowerCase();
		int n = smallTestString.length();
		System.out.println(smallTestString);
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
		System.out.println(n);

	}

}
