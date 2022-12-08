package in.co.raysbasicjava;

public class SwitchcaseCalculator {
	public static void main(String[] args) {
		int a = 12;
		int b = 11;
		int c = 3;
		switch (c) {
		case 1 :
			int add=a+b;
			System.out.println("add the no"+add);
			break;
		case 2:
			int sub =a-b;
			System.out.println("sub the no"+sub);
			break;
		case 3:
			int multi = a*b;
			System.out.println("multi the no"+multi);
			break;
			default:
				System.out.println("this is default block");
					break;
		}
	}
}
				
				
			