import java.util.Scanner;
import java.lang.Math;
public class OutsiderCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int CHOR_CALCULATOR = 1;
		final int PHAN_CALCULATOR = 2;
		final int QUIT_CALCULATOR = 0;
		double chorLevel;
		double ponyboyLevel;
		double phanLevel;
		int menuSelect;
		//main program loop
		
		do {
			System.out.println("What would you like to do?");
			System.out.println("Enter 1 to calculate Chor'gorloth against Ponyboy.");
			System.out.println("Enter 2 to calculate Phandoryss against Ponyboy.");
			System.out.println("Enter 0 to exit program.");
			menuSelect = keyboard.nextInt();
			
			switch(menuSelect) {
			case CHOR_CALCULATOR:
				System.out.println("Enter 1 to find Chor'gorloth.");
				System.out.println("Enter 2 to find Ponyboy.");
				menuSelect = keyboard.nextInt();
				if (menuSelect == 1) {
					System.out.println("Enter Ponyboy's level: ");
					ponyboyLevel = keyboard.nextDouble();
					chorLevel = (Math.pow(ponyboyLevel,2)/39);
					System.out.println("Chor'gorloth should be level "+chorLevel);
				}
				else if (menuSelect == 2) {
					System.out.println("Enter Chor'gorloth's level.");
					chorLevel = keyboard.nextDouble();
					ponyboyLevel = Math.sqrt(chorLevel*39);
					System.out.println("Ponyboy should be level "+ponyboyLevel);
				}
				else {
					System.out.println("Input invalid");
				}
				break;
			case PHAN_CALCULATOR:
				System.out.println("Enter 1 to find Phandoryss");
				System.out.println("Enter 2 to find Ponyboy");
				menuSelect = keyboard.nextInt();
				if (menuSelect == 1) {
					System.out.println("Enter Ponyboy's level: ");
					ponyboyLevel = keyboard.nextDouble();
					phanLevel = (Math.pow(ponyboyLevel, 2)+ponyboyLevel)/14.52;
					System.out.println("Phandoryss level should be "+phanLevel);
				}
				else if (menuSelect == 2) {
					System.out.println("Enter Phandoryss's level: ");
					phanLevel = keyboard.nextDouble();
					ponyboyLevel = (-1+Math.sqrt(1+58.08*phanLevel))/2;
					System.out.println("Ponyboy's level should be "+ponyboyLevel);
				}
				else {
					System.out.println("Input invalid");
				}
				break;
			case QUIT_CALCULATOR:
				break;
			}
		} while(menuSelect != 0);
		System.out.println("Program has exited.");
	}

}
