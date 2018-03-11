package menu;

public class InvalidMenuOption implements MenuOption {

	@Override
	public boolean execute() {
		System.out.println("You have selected an invalid menu option. Please try again!");
		return false;
	}
}
