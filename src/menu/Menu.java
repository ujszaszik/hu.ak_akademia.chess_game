package menu;

public class Menu {

	public static void show() {
		boolean exit = false;
		do {
			System.out.println("1 - Start new game");
			System.out.println("2 - Save game");
			System.out.println("3 - Load game");
			System.out.println("0 - Exit");
			int selection = UserInputReader.INSTANCE.readMenuOption();

			MenuOption selectedOption;
			switch (selection) {
			case 1:
				selectedOption = new NewGame();
				break;
			case 2:
				selectedOption = new SaveGame();
				break;
			case 3:
				selectedOption = new LoadGame();
				break;
			case 0:
				selectedOption = new ExitGame();
				break;
			default:
				selectedOption = new InvalidMenuOption();
				break;
			}
			exit = selectedOption.execute();
		} while (!exit);
	}

}
