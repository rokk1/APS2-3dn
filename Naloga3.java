import java.util.*;
public class Naloga3 {
	
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		String alg = in.next();
		System.out.printf("%s\n", alg);

		switch (alg) {
			case ("2c"):
				System.out.println("2c");
				break;
			case ("gr"):
				System.out.println("gr");
				break;
			case ("ex"):
				System.out.println("ex");
				break;
			case ("bt"):
				System.out.println("bt");
				break;
			default:
			System.out.println("dp");
				break;
		}
	}
}