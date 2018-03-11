package menu;

import java.util.Scanner;

public enum UserInputReader {

	INSTANCE;

	private static final Scanner scanner = new Scanner(System.in);

	public int readMenuOption() {
		System.out.println("Please select an option: ");
		int selection = scanner.nextInt();
		scanner.nextLine();
		return selection;
	}

}
